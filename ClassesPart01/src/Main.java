public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.make = "asdf";
        System.out.println("make: " + car.getMake());
        car.setMake("nexon");
        car.setModel("Nexon");
        car.setColor("Black");
        car.setDoors(4);
        car.setConvertible(false);
        car.describeCar();

        Account manasAccount = new Account();
        manasAccount.setAccountNumber(9070503010L);
        manasAccount.depositFund(1000);
        manasAccount.setCustomerName("Manas Deo");
        manasAccount.setEmail("manas@gmail.com");
        manasAccount.setPhoneNumber("9876543210");

        manasAccount.describeAccountDetails();

        manasAccount.withdrawFund(2000);
        manasAccount.withdrawFund(1000);
    }

    /*
     * What is oop
     * WHat is class
     * What is Encapsulation in OOP.
     * Getter/Setter
     * */


    /*
     * Challange -
     * Create a new bank account class;
     * Create fields for account characteristics like
     *      - account balance
     *      - account number
     *      - customer name
     *      - email
     *      - phone number
     * Create getter/setter for each field;
     * Create 2 additional method:
     *      - One for depositing funds to the account
     *      - One for withdrawing funds from the account
     * A customer is not allowed to withdraw funds, if withdrawal take the balance to -ve.
     */
}
