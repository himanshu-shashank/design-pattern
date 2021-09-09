package com.himanshu.designpattern.creational.factorypattern;

import com.himanshu.designpattern.creational.factorypattern.factory.Dialog;
import com.himanshu.designpattern.creational.factorypattern.factory.HtmlDialog;
import com.himanshu.designpattern.creational.factorypattern.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    private static void configure() {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
