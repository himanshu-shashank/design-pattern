package com.himanshu.simple.designpattern.behavioural.command.commands;

import com.himanshu.simple.designpattern.behavioural.command.devices.ElectronicDevice;

public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.on();

    }

    public void undo() {

        theDevice.off();

    }

}