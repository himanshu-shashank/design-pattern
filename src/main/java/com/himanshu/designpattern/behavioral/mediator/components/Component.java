package com.himanshu.designpattern.behavioral.mediator.components;

import com.himanshu.designpattern.behavioral.mediator.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
