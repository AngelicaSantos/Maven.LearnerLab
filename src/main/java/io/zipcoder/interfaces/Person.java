package io.zipcoder.interfaces;

public class Person {

    //fields
    final Long id;
    private String name;


    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getfirstName() {
        return name;
    }


    public void setFirstName(String angela) {
        this.name = angela;
    }


}