package com.qfedu.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qfedu.pojo.Train;

@Service
public class TrainServiceTest {
    public static void main(String[] args) {
        TrainService trainService = new TrainService();
        try {
            List<Train> trains = trainService.getTrains("上海", "南京");
            for (Train train : trains) {
                System.out.println("车次: " + train.getTrainCode());
                System.out.println("始发站: " + train.getFirstStation());
                System.out.println("终点站: " + train.getLastStation());
                System.out.println("发车站: " + train.getStartStation());
                System.out.println("发车时间: " + train.getStartTime());
                System.out.println("到达站: " + train.getArriveStation());
                System.out.println("到达时间: " + train.getArriveTime());
                System.out.println("里程: " + train.getKm() + "KM");
                System.out.println("历时: " + train.getUseDate());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
