class GradedActivity {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public char getGrade() {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }
}

class Essay extends GradedActivity {
    private double grammarScore;
    private double spellingScore;
    private double lengthScore;
    private double contentScore;

    public Essay() {
        setGrammarScore(grammarScore);
        setSpellingScore(spellingScore);
        setLengthScore(lengthScore);
        setContentScore(contentScore);
        setScore(this.grammarScore + this.spellingScore + this.lengthScore + this.contentScore);
    }

    public double getGrammarScore() {
        return grammarScore;
    }

    public void setGrammarScore(double grammarScore) {
        if (grammarScore <= 30) this.grammarScore = grammarScore;
        else throw new IllegalArgumentException("Grammar score cannot exceed 30 points.");
    }

    public double getSpellingScore() {
        return spellingScore;
    }

    public void setSpellingScore(double spellingScore) {
        if (spellingScore <= 20) this.spellingScore = spellingScore;
        else throw new IllegalArgumentException("Spelling score cannot exceed 20 points.");
    }

    public double getLengthScore() {
        return lengthScore;
    }

    public void setLengthScore(double lengthScore) {
        if (lengthScore <= 20) this.lengthScore = lengthScore;
        else throw new IllegalArgumentException("Length score cannot exceed 20 points.");
    }

    public double getContentScore() {
        return contentScore;
    }

    public void setContentScore(double contentScore) {
        if (contentScore <= 30) this.contentScore = contentScore;
        else throw new IllegalArgumentException("Content score cannot exceed 30 points.");
    }
}
