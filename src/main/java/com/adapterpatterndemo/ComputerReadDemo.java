package com.adapterpatterndemo;

/**
 * 版权:上海屋聚 版权所有
 * author: yandeqing
 * version: 3.0.0
 * date:2019/8/3
 * 备注:适配器模式
 * 
 */
public class ComputerReadDemo {
    public static void main(String[] args) {
        readSDExample();
        readSDAdapterExample();
    }

    private static void readSDAdapterExample() {
        Computer computer = new ThinkpadComputer();
        SDCard tfCardAdapterSD = new SDAdapterTF(new TFCardImpl());
        System.out.println(computer.readSD(tfCardAdapterSD));
    }

    private static void readSDExample() {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
    }
}