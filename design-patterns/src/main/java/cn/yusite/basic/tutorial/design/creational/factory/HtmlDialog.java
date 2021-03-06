package cn.yusite.basic.tutorial.design.creational.factory;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {

        return new HtmlButton();
    }
}
