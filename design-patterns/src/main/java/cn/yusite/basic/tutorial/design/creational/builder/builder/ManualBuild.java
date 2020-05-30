package cn.yusite.basic.tutorial.design.creational.builder.builder;

import cn.yusite.basic.tutorial.design.creational.builder.car.Car;
import cn.yusite.basic.tutorial.design.creational.builder.car.Manual;
import cn.yusite.basic.tutorial.design.creational.builder.car.Type;
import cn.yusite.basic.tutorial.design.creational.builder.component.Engine;

public class ManualBuild {

    private Type type;
    private int seats;
    private Engine engine;
    private double fuel = 0;

    public void setType(Type type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Manual getManual(){

        return new Manual(type, seats, engine);
    }

}
