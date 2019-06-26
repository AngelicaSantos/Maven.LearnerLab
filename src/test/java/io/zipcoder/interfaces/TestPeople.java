package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {

    @Test
    public void testAdd(){
        People people = new People();
        people.add(new Person((long)1, "angie"));
        people.add(new Person((long)2, "stephanie"));
        people.add(new Person((long)3, "kevin"));

        Assert.assertEquals(Integer.valueOf(3), people.count());
    }

    @Test
    public void testRemovePeople(){
        ArrayList<Person> a = new ArrayList<>();
        a.add(new Person((long)1, "angie"));
        a.add(new Person((long)2, "stephanie"));

        People people = new People();
        Person cee = new Person((long)3, "kevin");
        people.add(cee);


        people.remove(cee);
        Assert.assertFalse(people.contains(cee));
    }

    @Test
    public void testRemoveIndex(){
        ArrayList<Person> a = new ArrayList<>();
        a.add(new Person((long)1, "angie"));
        a.add(new Person((long)2, "stephanie"));

        People people = new People();
        Person cee = new Person((long)3, "kevin");
        people.add(cee);


        people.remove((long) 3);
        Assert.assertFalse(people.contains(cee));
    }

    @Test
    public void testFindById(){
        ArrayList<Person> a = new ArrayList<>();
        a.add(new Person((long)1, "angie"));
        a.add(new Person((long)2, "stephanie"));

        People people = new People();
        Person cee = new Person((long)3, "kevin");
        people.add(cee);

        Person bleh = people.findById((long)3);
        Assert.assertEquals(cee, bleh );
    }
}
