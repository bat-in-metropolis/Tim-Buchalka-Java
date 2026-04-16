public class Account {
    private double accountBalance;
    private long accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;

    public double getAccountBalance() {
        return accountBalance;
    }

//    public void setAccount_balance(int accountBalance) {
//        this.accountBalance = accountBalance;
//    }

    public long getAccount_number() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomer_name() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double fund) {
        if (fund < 0) {
            System.out.println("Cannot deposit the fund as it's negative!");
            return;
        }
        this.accountBalance = this.accountBalance + fund;
        System.out.println("Updated balance is: " + this.accountBalance);
    }

    public void withdrawFund(double fund) {
        if (this.accountBalance - fund < 0) {
            System.out.println("This fund withdraw is blocked, as you don't have sufficient account balance. Please try with a lesser amount.");
            return;
        }
        this.accountBalance = this.accountBalance - fund;
        System.out.println("Updated balance is: " + this.accountBalance);
    }

    public void describeAccountDetails() {
        System.out.println("This account belongs to " + this.customerName + " with account number " + this.accountNumber + " phone number is " + this.phoneNumber + " and email id is " + this.email + " and has a current account balance of " + this.accountBalance + "rs.");
    }
}
