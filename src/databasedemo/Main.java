package databasedemo;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter new customer name: ");
        String name = scanner.nextLine();
        int id = 0;

        Customer customer = new Customer(id, name);

        //Add this customer to storage


        System.out.print("Search for customer: ");
        name = scanner.nextLine();


        //searchresult = //Search for customer

        //Print customer
        //System.out.println(searchresult);


    }

}
