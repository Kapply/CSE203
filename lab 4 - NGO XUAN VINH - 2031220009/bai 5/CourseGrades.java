import java.util.List;

public class CourseGrades {

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

}
