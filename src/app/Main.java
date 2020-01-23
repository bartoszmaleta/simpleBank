package app;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Worldwide Programmers Bank");
        bank.addBranch("Utopia");
        bank.addCustomer("Utopia", "Bartosz", 10.45);
        bank.addCustomer("Utopia", "John", 99.75);
        bank.addCustomer("Utopia", "Tom", 128.64);

        bank.addBranch("Atlantis");
        bank.addCustomer("Atlantis", "Steven", 512.16);

        bank.addCustomerTransaction("Utopia", "Bartosz", 4569.78);
        bank.addCustomerTransaction("Utopia", "Bartosz", 1047.66);
        bank.addCustomerTransaction("Utopia", "John", 645.78);
        // bank.addCustomerTransaction("Utopia", "Bartosz", 45.78);

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

        
    }
}