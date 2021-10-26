package com.himanshu.simple.designpattern.behavioural.command;

import com.himanshu.simple.designpattern.behavioural.command.devices.ElectronicDevice;
import com.himanshu.simple.designpattern.behavioural.command.devices.Television;

public class TVRemote {

    public static ElectronicDevice getDevice(){

        return new Television();

    }

}