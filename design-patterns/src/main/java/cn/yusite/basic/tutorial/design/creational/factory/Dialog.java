package cn.yusite.basic.tutorial.design.creational.factory;

public abstract class Dialog {

    public void renderWindow(){

        Button button = createButton();
        button.render();
    }

    /**
     * factory method
     * @return {@link Button}
     */
    public abstract Button createButton();
}
