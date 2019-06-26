package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

@Test
public void constructorTest() {
//Given:
String name = "Angelica";
Long id = Long.valueOf(123);
Person testPerson = new Person(id, name);

String expected = "Angelica";
String actual = testPerson.getfirstName();

//Then:
    Assert.assertEquals(expected, actual);


}

@Test
public void setNameTest () {
//Given:
String name = "Angela";
Long id = Long.valueOf(1234);
Person testPerson = new Person(id, name);

//When:
    String expected = "Angela";
    testPerson.setFirstName("Angela");
    String actual=testPerson.getfirstName();
    Assert.assertEquals(expected,actual);

//Then:


}









}
