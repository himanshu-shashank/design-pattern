package com.himanshu.simple.designpattern.structural.bridge.remotes;

// Refined Abstraction

// If I decide I want to further extend the remote I can

import com.himanshu.simple.designpattern.structural.bridge.devices.EntertainmentDevice;

public class TVRemotePause extends RemoteButton{

    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        System.out.println("TV was Paused");

    }

}
