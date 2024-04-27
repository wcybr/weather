package com.qfedu.service.impl;

import com.qfedu.pojo.Train;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class TrainService {

    public List<Train> getTrains(String startStation, String arriveStation) throws IOException, ParserConfigurationException, SAXException {
        // 如果输入参数为空，使用默认值
        if (startStation == null || startStation.isEmpty()) {
            startStation = "上海";
        }
        if (arriveStation == null || arriveStation.isEmpty()) {
            arriveStation = "北京";
        }
        // 注意：URL中的空格应该使用URL编码，这里为了简化，假设空格不是问题
        String apiUrl = "http://www.webxml.com.cn/webservices/traintimewebservice.asmx/getStationAndTimeByStationName?StartStation=" + startStation + "&ArriveStation=" + arriveStation + "&UserID=";
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "text/xml; charset=utf-8");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(con.getInputStream(), "UTF-8");
        doc.getDocumentElement().normalize();

        // 获取列车信息节点
        NodeList timeTableList = doc.getElementsByTagName("TimeTable");

        List<Train> trainList = new ArrayList<>();
        for (int i = 0; i < timeTableList.getLength(); i++) {
            Element timeTableElement = (Element) timeTableList.item(i);
            Train train = new Train();
            train.setTrainCode(timeTableElement.getElementsByTagName("TrainCode").item(0).getTextContent());
            train.setFirstStation(timeTableElement.getElementsByTagName("FirstStation").item(0).getTextContent());
            train.setLastStation(timeTableElement.getElementsByTagName("LastStation").item(0).getTextContent());
            train.setStartStation(timeTableElement.getElementsByTagName("StartStation").item(0).getTextContent());
            train.setStartTime(timeTableElement.getElementsByTagName("StartTime").item(0).getTextContent());
            train.setArriveStation(timeTableElement.getElementsByTagName("ArriveStation").item(0).getTextContent());
            train.setArriveTime(timeTableElement.getElementsByTagName("ArriveTime").item(0).getTextContent());
            train.setKm(timeTableElement.getElementsByTagName("KM").item(0).getTextContent());
            train.setUseDate(timeTableElement.getElementsByTagName("UseDate").item(0).getTextContent());
            trainList.add(train);
        }

        return trainList;
    }
}