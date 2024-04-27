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
	public class WeatherService { 

	public String getWeather(String city) throws IOException, JSONException {
        // 构造API请求的URL
        String apiUrl = "https://restapi.amap.com/v3/weather/weatherInfo?city="+city+"&key=a3ab1115a52546f632f9f7026ef8440d";

        // 发送HTTP请求
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

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
        String weather=jsonObj.getJSONArray("lives").getJSONObject(0).getString("weather");
        return weather;}
     
}
