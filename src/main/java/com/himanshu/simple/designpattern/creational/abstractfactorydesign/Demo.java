package com.himanshu.simple.designpattern.creational.abstractfactorydesign;

import com.himanshu.simple.designpattern.creational.abstractfactorydesign.shipbuilding.EnemyShipBuilding;
import com.himanshu.simple.designpattern.creational.abstractfactorydesign.shipbuilding.UFOEnemyShipBuilding;
import com.himanshu.simple.designpattern.creational.abstractfactorydesign.ships.EnemyShip;

public class Demo {
    public static void main(String[] args) {
        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");
    }
}
