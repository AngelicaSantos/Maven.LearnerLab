package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher   {


    public Instructor(Long id, String name) {
        super(id,name);
    }

    public Instructor() {
        super(null,null);
    }

    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(int i=0; i<learners.length; i++) {
            teach(learners[i],numberOfHoursPerLearner);
        }
    }
}
