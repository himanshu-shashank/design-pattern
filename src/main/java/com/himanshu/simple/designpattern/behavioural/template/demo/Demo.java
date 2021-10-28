package com.himanshu.simple.designpattern.behavioural.template.demo;

import com.himanshu.simple.designpattern.behavioural.template.hoagie.ItalianHoagie;
import com.himanshu.simple.designpattern.behavioural.template.hoagie.VeggieHoagie;

public class Demo {
    public static void main(String[] args){

        ItalianHoagie cust12Hoagie = new ItalianHoagie();

        cust12Hoagie.makeSandwich();

        System.out.println();

        VeggieHoagie cust13Hoagie = new VeggieHoagie();

        cust13Hoagie.makeSandwich();

    }
}
