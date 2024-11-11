import java.util.List;

public class CourseGrades implements Analyzable {

    private GradedActivity[] grades = new GradedActivity[4];

    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }

    public void setPassFailExam(PassFailExam passFailExam) {
        grades[1] = passFailExam;
    }

    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < grades.length; i++) {
            result.append("Activity ").append(i + 1).append(": ");
            result.append("Score = ").append(grades[i].getScore());
            result.append(", Grade = ").append(grades[i].getGrade()).append("\n");
        }
        return result.toString();
    }

    @Override
    public double getAverage() {
        double result = 0;
        for (GradedActivity grade : grades) {
            result += grade.getScore();
        }
        return result / grades.length;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity highActivity = grades[0];
        for (GradedActivity grade : grades) {
            if (grade.getScore() > highActivity.getScore()) {
                highActivity = grade;
            }
        }
        return highActivity;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity lowActivity = grades[0];
        for (GradedActivity grade : grades) {
            if (grade.getScore() < lowActivity.getScore()) {
                lowActivity = grade;
            }
        }
        return lowActivity;
    }

}
