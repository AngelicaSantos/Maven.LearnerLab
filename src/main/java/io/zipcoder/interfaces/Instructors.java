package io.zipcoder.interfaces;

public final class Instructors extends People {
    final static private Instructors INSTANCE = new Instructors();


    public Instructors() {

        add(new Instructor((long) 1, "Kris"));
        add(new Instructor((long) 2, "Dolio"));
        add(new Instructor((long) 3, "Froilan"));
    }

    public static Instructors returnInstance() {
        return INSTANCE;
    }
}
