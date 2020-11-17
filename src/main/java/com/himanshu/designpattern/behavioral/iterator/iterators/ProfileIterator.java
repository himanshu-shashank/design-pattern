package com.himanshu.designpattern.behavioral.iterator.iterators;

import com.himanshu.designpattern.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}