package databasedemo;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter new customer name: ");
        String name = scanner.nextLine();
        int id = 0;

        Customer customer = new Customer(id, name);

        //ListStorage storage = new ListStorage();
        //SqLiteStorage storage = new SqLiteStorage();
        NitriteStorage storage = new NitriteStorage();

        storage.addCustomer(customer);

        System.out.print("Search for customer: ");
        name = scanner.nextLine();

        Customer searchResult = storage.findFirstCustomer(name);
        //Print customer
        System.out.println(searchResult);
    }

}
