package com.himanshu.designpattern.creational.abstractfactory.buttons;
/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button {

    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
