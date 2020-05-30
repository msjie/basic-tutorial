package cn.yusite.basic.tutorial.design.creational.builder.car;

import cn.yusite.basic.tutorial.design.creational.builder.component.Engine;

public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private double fuel = 0;

    public Manual(Type type, int seats, Engine engine) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
    }

    public String print() {
        return "Manual{" +
                "type=" + type +
                ", seats=" + seats +
                ", engine=" + engine +
                ", fuel=" + fuel +
                '}';
    }
}
