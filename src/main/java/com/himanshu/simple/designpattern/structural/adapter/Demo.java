package com.himanshu.simple.designpattern.structural.adapter;

import com.himanshu.simple.designpattern.structural.adapter.adapters.EnemyRobotAdapter;
import com.himanshu.simple.designpattern.structural.adapter.enemy.EnemyAttacker;
import com.himanshu.simple.designpattern.structural.adapter.enemy.EnemyRobot;
import com.himanshu.simple.designpattern.structural.adapter.enemy.EnemyTank;

public class Demo {
    public static void main(String[] args){

        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }
}
