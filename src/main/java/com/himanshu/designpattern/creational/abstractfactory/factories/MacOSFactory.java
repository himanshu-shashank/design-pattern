package com.himanshu.designpattern.creational.abstractfactory.factories;

import com.himanshu.designpattern.creational.abstractfactory.buttons.Button;
import com.himanshu.designpattern.creational.abstractfactory.buttons.MacOSButton;
import com.himanshu.designpattern.creational.abstractfactory.checkboxes.Checkbox;
import com.himanshu.designpattern.creational.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    public Button createGuiButton() {
        return new MacOSButton();
    }

    public Checkbox createGuiCheckbox() {
        return new MacOSCheckbox();
    }
}
