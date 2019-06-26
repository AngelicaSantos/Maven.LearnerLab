package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    @Test
public void implementationTest() {

    Student testStudent =  new Student();

    Assert.assertTrue(testStudent instanceof Learner);
}

    @Test
    public void inheritanceTest() {

        Student testStudent =  new Student();

        Assert.assertTrue(testStudent instanceof Person);
    }

    @Test
    public void learnTest() {
        Student testStudent = new Student();
        Double input = 12.0;

        Double expected = 12.0;
        testStudent.learn(input);
        Double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }


}
