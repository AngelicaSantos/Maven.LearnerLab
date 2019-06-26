package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {

    private Instructor instructor;

    @Before
    public void setUp(){
        instructor = new Instructor();
    }

    @After
    public void breakDown(){
        instructor = null;
    }
    @Test
    public void implementaionTest() {
//        Instructor instructor = new Instructor();

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
//        Instructor instructor = new Instructor();

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {

        Double input = 12.0;
        Learner learner = new Student();

        Double expected = 12.0;
        instructor.teach(learner,input);
        Double actual = learner.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lectureTest() {
//        Instructor instructor = new Instructor();
        Double input = 12.0;
        Learner[] learner = new Student[]{new Student(), new Student(), new Student()};

        Double expected = 4.0;
        instructor.lecture(learner,input);
        Double actual = learner[0].getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }







}




