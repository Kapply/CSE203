public class Employee {
    private String employeeName;
    private String employeeNumber;  
    private String hireDate;

    public Employee(String employeeName, String employeeNumber, String hireDate) {
        this.employeeName = employeeName;
        setEmployeeNumber(employeeNumber);
        this.hireDate = hireDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if (employeeNumber.matches("\\d{3}-[A-M]")) {
            this.employeeNumber = employeeNumber;
        } else {
            throw new IllegalArgumentException("Invalid employee number format. Format: XXX-L (X: 0-9, L: A-M)");
        }
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
