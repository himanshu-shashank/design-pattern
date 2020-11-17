package com.himanshu.designpattern.creational.factorypattern.factory;


import com.himanshu.designpattern.creational.factorypattern.buttons.Button;
import com.himanshu.designpattern.creational.factorypattern.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
