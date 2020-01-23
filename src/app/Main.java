package app;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Worldwide Programmers Bank");
        if (bank.addBranch("Utopia")) {
            System.out.println("Utopia branch created!");
        }
        bank.addCustomer("Utopia", "Bartosz", 10.45);
        bank.addCustomer("Utopia", "John", 99.75);
        bank.addCustomer("Utopia", "Tom", 128.64);

        bank.addBranch("Atlantis");
        bank.addCustomer("Atlantis", "Steven", 512.16);

        bank.addCustomerTransaction("Utopia", "Bartosz", 4569.78);
        bank.addCustomerTransaction("Utopia", "Bartosz", 1047.66);
        bank.addCustomerTransaction("Utopia", "John", 645.78);

        bank.listCustomers("Utopia", false);
        System.out.println();
        bank.listCustomers("Utopia", true);

        bank.listCustomers("Atlantis", true);

        if (!bank.addCustomer("Lyonesse", "Atlas", 3.45)) {
            System.out.println("Error Lyonesse branch does not exist");
        }

        bank.addBranch("Lyonesse");
        if (!bank.addCustomer("Lyonesse", "Atlas", 3.45)) {
            System.out.println("Error Lyonesse branch does not exist");
        }
        System.out.println();
        bank.listCustomers("Lyonesse", true);

        if(!bank.addBranch("Atlantis")) {
            System.out.println("Atlantis branch already exists");
        }
        
        if (!bank.addCustomerTransaction("Utopia", "George", 45.77)) {
            System.out.println("Customer does not exist at branch ");
        }

        if (!bank.addCustomer("Utopia", "Bartosz", 55.79)) {
            System.out.println("Customer Bartosz already exists");
        }
    }
}