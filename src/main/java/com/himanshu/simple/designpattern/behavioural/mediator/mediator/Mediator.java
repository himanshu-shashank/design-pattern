package com.himanshu.simple.designpattern.behavioural.mediator.mediator;

import com.himanshu.simple.designpattern.behavioural.mediator.collegue.Colleague;

public interface Mediator {

    public void saleOffer(String stock, int shares, int collCode);

    public void buyOffer(String stock, int shares, int collCode);

    public void addColleague(Colleague colleague);

}
