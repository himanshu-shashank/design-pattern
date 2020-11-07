package com.himanshu.designpattern.creational.factorypattern.factory;

import com.himanshu.designpattern.creational.factorypattern.buttons.Button;
import com.himanshu.designpattern.creational.factorypattern.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
