package com.himanshu.simple.designpattern.behavioural.command.commands;

import com.himanshu.simple.designpattern.behavioural.command.devices.ElectronicDevice;

public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.volumeUp();

    }

    public void undo() {

        theDevice.volumenDown();

    }

}
