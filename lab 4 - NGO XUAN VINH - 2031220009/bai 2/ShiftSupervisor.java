class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double annualProductionBonus;

    public ShiftSupervisor(String employeeName, String employeeNumber, String hireDate, double annualSalary, double annualProductionBonus) {
        super(employeeName, employeeNumber, hireDate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }
}
