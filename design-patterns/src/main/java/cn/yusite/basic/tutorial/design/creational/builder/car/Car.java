package cn.yusite.basic.tutorial.design.creational.builder.car;

import cn.yusite.basic.tutorial.design.creational.builder.component.Engine;

public class Car {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private double fuel = 0;

    public Car(Type type, int seats, Engine engine) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
    }


}
