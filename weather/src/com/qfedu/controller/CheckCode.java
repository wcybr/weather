package com.qfedu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qfedu.service.impl.RandomValidateCode;

@Controller("checkCode")

public class CheckCode {
    // 验证码输出
@RequestMapping("/checkCode.do")
    public void checkCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应类型，告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");
        // 设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response); // 输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/submitForm")
    public String submitForm(HttpServletRequest request, HttpSession session,
            @RequestParam("checkcode") String checkcode) {
        String sessionCode = (String) session.getAttribute(RandomValidateCode.RANDOMCODEKEY);
        if (checkcode.equalsIgnoreCase(sessionCode)) {
            // 验证码正确，进行页面跳转
            return "redirect:/neivigate.jsp";
        } else {
            // 验证码不正确，返回原页面或者进行其他处理
            return "redirect:/check.jsp";
        }
    }
}