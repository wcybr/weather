package com.qfedu.controller;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qfedu.pojo.Train;
import com.qfedu.pojo.money;
import com.qfedu.service.MoneyService;
import com.qfedu.service.impl.PhoneNumber;
import com.qfedu.service.impl.Post;
import com.qfedu.service.impl.TrainService;
import com.qfedu.service.impl.WeatherService;

@Controller("MoneyController")
public class MoneyController {
	@Autowired
	private MoneyService moneyService;
	@Autowired
	private WeatherService weatherservice;
	@Autowired
	private PhoneNumber numberservice;
	@Autowired
	private Post post;
	@Autowired
    private  TrainService trainService;
	@RequestMapping(value="/moneyadd",method=RequestMethod.POST)
	public String add(money money) {
		moneyService.add(money);
		return "moneymap";
	}
	@RequestMapping(value="/moneyall",method=RequestMethod.GET)
	public String all(Model model) {
		model.addAttribute("money", moneyService.queryAll());
		return "moneymap";
	}
	@RequestMapping(value="/moneydelete",method=RequestMethod.GET)
	public String  del(String  xid){
		moneyService.del(xid);
		return "moneymap";
		
	}
	@RequestMapping(value="/moneyupda",method=RequestMethod.POST)
	public String  update(money money){
		moneyService.update(money);
		return "moneymap";
		
	}
	@RequestMapping(value="/moneyfindOne",method=RequestMethod.POST)
	public String Jump(money money,Model model){
	    if(money!=null){
	  model.addAttribute("money", moneyService.findOne(money));
	    	return "moneymap";
	    }
		return "moneyall";
		
	}
	@RequestMapping(value="/findweather",method=RequestMethod.GET)
	public String Findweather(String  city,Model model) throws IOException, JSONException{
		  if(city!=null){
	  model.addAttribute("weather", weatherservice.getWeather(city));
		return "weather";}
		  return "moneymap";
		
	}
	@RequestMapping(value="/findaddress",method=RequestMethod.GET)
	public String Findaddress(String  number,Model model) throws IOException, JSONException{
		  if(number!=null){
	  model.addAttribute("address", numberservice.getAddress(number));
		return "weather";}
		  return "moneymap";
		
	}
	@RequestMapping(value="/findcity",method=RequestMethod.GET)
	public String Findcity(String  code,Model model) throws IOException, JSONException{
		  if(code!=null){
	  model.addAttribute("city", post.getCity(code));
		return "weather";}
		  return "moneymap";
		
	}
	@RequestMapping(value="/findtrains",method=RequestMethod.POST)
	  public String FindTrains(String start,String end, Model model)  {                                       
	     try {
	            List<Train> trains = trainService.getTrains(start, end);
	            model.addAttribute("tra", trains);
	        } catch (Exception e) {
	            // 处理异常，例如记录日志
	            e.printStackTrace();
	            model.addAttribute("error", "无法获取列车信息");
	        }
	        return "trains"; // 返回JSP页面的名称
	    }
}