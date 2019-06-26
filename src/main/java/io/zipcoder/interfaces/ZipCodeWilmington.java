package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class ZipCodeWilmington {
    final private static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington() {

        this.students = Students.returnInstance();
        this.instructors= Instructors.returnInstance();
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        ArrayList<Learner> arrayList = new ArrayList<>();
        for (Object student : students
             ) {
            arrayList.add((Learner) student);
        }
        Learner[] learners = new Learner[arrayList.size()];
        learners = arrayList.toArray(learners);
        teacher.lecture(learners,numberOfHours);

//        teacher.lecture((Learner[]) students.toArray(),numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {

//        ((Teacher) instructors.findById(id)).lecture((Learner[]) students.toArray(),numberOfHours );

    }

    public static ZipCodeWilmington getinstance() {
        return INSTANCE;
    }





}
