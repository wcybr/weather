package com.qfedu.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Post {
	public String getCity(String code) throws IOException, JSONException {
	// 构造API请求的URL
    String apiUrl = "http://v.juhe.cn/postcode/query?postcode="+code+"&key= f4872eb943923025c2bb468b4318618f";
    

    // 发送HTTP请求
    URL url = new URL(apiUrl);
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    // 设置请求header
    con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    // 读取API响应
    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
    String inputLine;
    StringBuffer response = new StringBuffer();
    while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
    in.close();

    // 解析JSON响应
    JSONObject jsonObj = new JSONObject(response.toString());
    String city=jsonObj.getJSONObject("result").getJSONArray("list").getJSONObject(0).getString("District");
    return city;}
}
