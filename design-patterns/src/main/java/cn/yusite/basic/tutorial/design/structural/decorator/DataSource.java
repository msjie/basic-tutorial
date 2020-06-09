package cn.yusite.basic.tutorial.design.structural.decorator;

public interface DataSource {

    void writeData(String data);

    String readData();

}
