class TeamLeader extends ProductionWorker {
    private double monthlyBonus;
    private int requiredTrainingHours;
    private int attendedTrainingHours;

    public TeamLeader(String employeeName, String employeeNumber, String hireDate, int shift, double hourlyPayRate,
                      double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours) {
        super(employeeName, employeeNumber, hireDate, shift, hourlyPayRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.attendedTrainingHours = attendedTrainingHours;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(int requiredTrainingHours) {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public int getAttendedTrainingHours() {
        return attendedTrainingHours;
    }

    public void setAttendedTrainingHours(int attendedTrainingHours) {
        this.attendedTrainingHours = attendedTrainingHours;
    }
}
