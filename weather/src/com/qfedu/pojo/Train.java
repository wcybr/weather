package com.qfedu.pojo;

public class Train {
    private String trainCode; // 车次
    private String firstStation; // 始发站
    private String lastStation; // 终点站
    private String startStation; // 发车站
    private String startTime; // 发车时间
    private String arriveStation; // 到达站
    private String arriveTime; // 到达时间
    private String km; // 里程(KM)
    private String useDate; // 历时

    // 构造函数
    public Train() {
    }

    // Getter和Setter方法
    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    public String getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(String firstStation) {
        this.firstStation = firstStation;
    }

    public String getLastStation() {
        return lastStation;
    }

    public void setLastStation(String lastStation) {
        this.lastStation = lastStation;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getArriveStation() {
        return arriveStation;
    }

    public void setArriveStation(String arriveStation) {
        this.arriveStation = arriveStation;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate;
    }

    // 可以添加toString方法用于打印对象信息
    @Override
    public String toString() {
        return "Train{" +
                "trainCode='" + trainCode + '\'' +
                ", firstStation='" + firstStation + '\'' +
                ", lastStation='" + lastStation + '\'' +
                ", startStation='" + startStation + '\'' +
                ", startTime='" + startTime + '\'' +
                ", arriveStation='" + arriveStation + '\'' +
                ", arriveTime='" + arriveTime + '\'' +
                ", km='" + km + '\'' +
                ", useDate='" + useDate + '\'' +
                '}';
    }
}