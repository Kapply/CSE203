public class test {
    public static void main(String[] args) {


        GradedActivity gradedactivity = new GradedActivity();
        gradedactivity.setScore(40);

        PassFailExam passFailExam = new PassFailExam(55, 9, 11);
        passFailExam.setScore(75);

        Essay essay = new Essay();
        essay.Grade(29, 15, 18, 14);

        FinalExam finalExam = new FinalExam(30, 20);
        finalExam.setScore(45);

        CourseGrades courseGrades = new CourseGrades();
        courseGrades.setLab(gradedactivity);
        courseGrades.setPassFailExam(passFailExam);
        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(finalExam);

        System.out.println(courseGrades);

    }

}
