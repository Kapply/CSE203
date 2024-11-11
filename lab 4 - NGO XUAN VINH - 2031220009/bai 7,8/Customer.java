public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;

    public Customer(String name, String address, String phoneNumber, String customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return " Name: " + getName() + ", Address: " + getAddress() + ", PhoneNumber: " + getPhoneNumber()
                + " , customerNumber: " + customerNumber + ", mailingList: " + mailingList;
    }

}
