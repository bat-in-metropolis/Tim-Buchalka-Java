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

        Account manasAccount = new Account("9876543210", "manas@gmail.com", "Manas Deo", 9070503010L, 2000);

        manasAccount.describeAccountDetails();

        manasAccount.withdrawFund(2000);
        manasAccount.withdrawFund(1000);

//        Customer manasCustomer = new Customer("Manas", 43, "manas@gmail.com");
//        Customer manasCustomer = new Customer("Manas", "manas@gmail.com");
        Customer manasCustomer = new Customer();

        System.out.println(manasCustomer.getName());
        System.out.println(manasCustomer.getCreditLimit());
        System.out.println(manasCustomer.getEmail());

        for (int i = 0; i <= 5; i++) {
            Student s = new Student("S92300" + i, switch (i) {
                case 1 -> "manas";
                case 2 -> "manasi";
                case 3 -> "meghu";
                case 4 -> "adarsh";
                case 5 -> "pari";
                default -> "Anonymous";
            }, "05/10/1997", "Java Masterclass");
            System.out.println(s);
        }
    }

    /*
     * What is oop
     * WHat is class
     * What is Encapsulation in OOP.
     * Getter/Setter
     * */


    /*
     * Constructor Challenge -
     * Create a new Customer class;
     * Create fields for account characteristics like
     *      - name
     *      - credit limit
     *      - email address
     * Create getter for each field;
     * Create 3 constructors
     *      1.Create a constructor for all 3 fields, which should assign arguments directly to instance field.
     *      2.Create a non-arguments constructor, it will call another constructor, passing some literal values for each argument.
     *      3.Create a constructor with just name and email parameters, which also calls another constructor.
     */
}
