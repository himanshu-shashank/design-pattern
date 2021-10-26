package com.himanshu.simple.designpattern.behavioural.command.commands;

import com.himanshu.simple.designpattern.behavioural.command.devices.ElectronicDevice;

public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.off();

    }

    // Used if you want to allow for undo
    // Do the opposite of execute()

    public void undo() {

        theDevice.on();

    }

}