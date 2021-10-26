package com.himanshu.simple.designpattern.structural.adapter.adapters;

// The Adapter must provide an alternative action for
// the the methods that need to be used because
// EnemyAttacker was implemented.

// This adapter does this by containing an object
// of the same type as the Adaptee (EnemyRobot)
// All calls to EnemyAttacker methods are sent
// instead to methods used by EnemyRobot

import com.himanshu.simple.designpattern.structural.adapter.enemy.EnemyAttacker;
import com.himanshu.simple.designpattern.structural.adapter.enemy.EnemyRobot;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot){

        theRobot = newRobot;

    }

    public void fireWeapon() {

        theRobot.smashWithHands();

    }

    public void driveForward() {

        theRobot.walkForward();

    }

    public void assignDriver(String driverName) {

        theRobot.reactToHuman(driverName);

    }



}