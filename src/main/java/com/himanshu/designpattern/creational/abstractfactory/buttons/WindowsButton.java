package com.himanshu.designpattern.creational.abstractfactory.buttons;
/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButton implements Button {

    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
