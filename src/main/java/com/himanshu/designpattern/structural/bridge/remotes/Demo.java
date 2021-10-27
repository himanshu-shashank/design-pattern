package com.himanshu.designpattern.structural.bridge.remotes;

import com.himanshu.designpattern.structural.bridge.devices.Device;
import com.himanshu.designpattern.structural.bridge.devices.Radio;
import com.himanshu.designpattern.structural.bridge.devices.Tv;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

