package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {
    private Instructors instructors;
    private Students students;
    private ZipCodeWilmington zipcode;

    @Before
    public void setUp() throws Exception {
     instructors= Instructors.returnInstance();
     students = Students.returnInstance();
     zipcode= ZipCodeWilmington.getinstance();
    }

    @Test
    public void hostLectureTest() {
        Teacher teacher = (Teacher)instructors.findById(1L);
        Student student = (Student)students.findById(1L);

        zipcode.hostLecture(teacher,70);
        Double expected = 10.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);

    }




    //@Test
//public void hostLectureTest() {
//    //Given:
//    Double input = 12.0;
//    Learner[] learner = new Student[]{new Student(), new Student(), new Student()};
//
//    Double expected = 4.0;
//    instructor.lecture(learner,input);
//    Double actual = learner[0].getTotalStudyTime();
//
//    Assert.assertEquals(expected, actual);

}






