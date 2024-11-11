public class Essay extends GradedActivity {

    public boolean Grade(double grammar, double spelling, double correctLength, double content) {
        if (grammar > 30) {
            return false;
        } else if (spelling > 20) {
            return false;
        } else if (correctLength > 20) {
            return false;
        } else if (content > 30) {
            return false;
        }
        double sum = grammar + spelling + correctLength + content;
        setScore(sum);
        return true;
    }

}
