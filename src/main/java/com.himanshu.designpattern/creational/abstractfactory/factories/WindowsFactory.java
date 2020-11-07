package com.himanshu.designpattern.creational.abstractfactory.factories;

import com.himanshu.designpattern.creational.abstractfactory.buttons.Button;
import com.himanshu.designpattern.creational.abstractfactory.buttons.WindowsButton;
import com.himanshu.designpattern.creational.abstractfactory.checkboxes.Checkbox;
import com.himanshu.designpattern.creational.abstractfactory.checkboxes.WindowsCheckbox;


/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    public Button createGuiButton() {
        return new WindowsButton();
    }

    public Checkbox createGuiCheckbox() {
        return new WindowsCheckbox();
    }
}