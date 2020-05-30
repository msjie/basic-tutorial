package cn.yusite.basic.tutorial.design.creational.builder.builder;

import cn.yusite.basic.tutorial.design.creational.builder.car.Type;
import cn.yusite.basic.tutorial.design.creational.builder.component.Engine;

public interface Builder {

    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
}
