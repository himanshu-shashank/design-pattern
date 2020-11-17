package com.himanshu.designpattern.behavioral.iterator.socialnetworks;

import com.himanshu.designpattern.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
