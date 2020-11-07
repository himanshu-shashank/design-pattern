package com.himanshu.designpattern.creational.abstractfactory;

import com.himanshu.designpattern.creational.abstractfactory.buttons.Button;
import com.himanshu.designpattern.creational.abstractfactory.checkboxes.Checkbox;
import com.himanshu.designpattern.creational.abstractfactory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
class Application {
    private Button button;
    private Checkbox checkbox;

    Application(GUIFactory factory) {
        button = factory.createGuiButton();
        checkbox = factory.createGuiCheckbox();
    }

    void paint() {
        button.paint();
        checkbox.paint();
    }
}

