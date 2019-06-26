package io.zipcoder.interfaces;

public final class Students extends People {
    final static private Students INSTANCE = new Students();



    public Students() {

        add(new Student((long) 1, "Angelica"));
        add(new Student((long) 2, "Dasha"));
        add(new Student((long) 3, "Alex"));
        add(new Student((long) 4, "Dan"));
        add(new Student((long) 5, "Bob"));
        add(new Student((long) 6, "Connor"));
        add(new Student((long) 7, "Erick"));


    }

    public static Students returnInstance() {
        return INSTANCE;
    }
}