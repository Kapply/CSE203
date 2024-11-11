class ProductionWorker extends Employee {
    private int shift;  
    private double hourlyPayRate;

    public ProductionWorker(String employeeName, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
        super(employeeName, employeeNumber, hireDate);
        setShift(shift);
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        if (shift == 1 || shift == 2) {
            this.shift = shift;
        } else {
            throw new IllegalArgumentException("Shift must be 1 (day) or 2 (night).");
        }
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}
