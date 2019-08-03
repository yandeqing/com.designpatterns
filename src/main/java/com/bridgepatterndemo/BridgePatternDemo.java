package com.bridgepatterndemo;

import com.bridgepatterndemo.imp.GreenCircle;
import com.bridgepatterndemo.imp.RedCircle;
import com.bridgepatterndemo.beans.Circle;
import com.bridgepatterndemo.beans.Shape;

/**
 * 版权:上海屋聚 版权所有
 * author: yandeqing
 * version: 3.0.0
 * date:2019/8/1
 * 备注:桥接模式示例 实现类似c++多继承的功能,减少类的数量,java继承和组合的应用
 * <p>
 * 1.连接抽象与实现的接口DrawAPI
 * 2.抽象类Shape(持有接口DrawAPI，使用接口，但不实现)
 * 3.桥接类Circle 1.构造实现类需要的参数，以及继承Shape 获得接口DrawAPI功能同
 * 4.接口实现类RedCircle,GreenCircle
 * <p>
 * 通过继承Circle的类可以拥有DrawAPI的drawCircle方法同时也可以继承Circle中所有的方法
 * 剖析本质:
 * 本质就是在一个类的基类中持有另外一个类的基类,各自子类的实现都是各自实现互不影响
 */

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
