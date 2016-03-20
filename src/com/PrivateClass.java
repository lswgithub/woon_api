package com;

/**
 * Created by lsw on 2016-03-11.
 */
public class PrivateClass {
    private static final PrivateClass instance = new PrivateClass();
    private PrivateClass() { }

    public static PrivateClass getInstance() {
        return instance;
    }
}
