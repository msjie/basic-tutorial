package cn.yusite.basic.tutorial.design.creational.factory;

/**
 * wond
 */
public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {

        return new WindowButton();
    }
}
