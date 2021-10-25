package com.himanshu.simple.designpattern.creational.abstractfactorydesign.factory;

// With an Abstract Factory Pattern you won't
// just build ships, but also all of the components
// for the ships

// Here is where you define the parts that are required
// if an object wants to be an enemy ship

import com.himanshu.simple.designpattern.creational.abstractfactorydesign.engine.ESEngine;
import com.himanshu.simple.designpattern.creational.abstractfactorydesign.weapons.ESWeapon;

public interface EnemyShipFactory{

    public ESWeapon addESGun();
    public ESEngine addESEngine();

}