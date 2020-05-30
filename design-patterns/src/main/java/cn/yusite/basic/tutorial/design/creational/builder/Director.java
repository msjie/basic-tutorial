package cn.yusite.basic.tutorial.design.creational.builder;

import cn.yusite.basic.tutorial.design.creational.builder.builder.Builder;
import cn.yusite.basic.tutorial.design.creational.builder.car.Type;
import cn.yusite.basic.tutorial.design.creational.builder.component.Engine;

public class Director {

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
    }
}
