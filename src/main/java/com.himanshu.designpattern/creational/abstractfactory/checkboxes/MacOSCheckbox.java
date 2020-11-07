package com.himanshu.designpattern.creational.abstractfactory.checkboxes;
/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacOSCheckbox implements Checkbox {

    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}