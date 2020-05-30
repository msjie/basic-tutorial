package cn.yusite.basic.tutorial.design.creational.abstr;

public class MacOsFactory implements GuiFactory {
    @Override
    public Button createButton() {

        return new MacOsButton();
    }
}
