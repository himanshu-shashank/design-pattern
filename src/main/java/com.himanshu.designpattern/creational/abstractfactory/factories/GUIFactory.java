package com.himanshu.designpattern.creational.abstractfactory.factories;


import com.himanshu.designpattern.creational.abstractfactory.buttons.Button;
import com.himanshu.designpattern.creational.abstractfactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createGuiButton();
    Checkbox createGuiCheckbox();
}