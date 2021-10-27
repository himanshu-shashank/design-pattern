package com.himanshu.simple.designpattern.structural.bridge.remotes;

// Refined Abstraction

// If I decide I want to further extend the remote I can

import com.himanshu.simple.designpattern.structural.bridge.devices.EntertainmentDevice;

public class DVDRemote extends RemoteButton{

    private boolean play = true;

    public DVDRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        play = !play;

        System.out.println("DVD is Playing: " + play);

    }

}
