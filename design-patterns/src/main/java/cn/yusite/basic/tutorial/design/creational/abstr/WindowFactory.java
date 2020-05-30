package cn.yusite.basic.tutorial.design.creational.abstr;

public class WindowFactory implements GuiFactory {
    @Override
    public Button createButton() {

        return new WindowOsButton();
    }
}
