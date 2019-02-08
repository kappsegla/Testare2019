package databasedemo;

import java.util.ArrayList;

public class ListStorage {

    ArrayList<Customer> customers = new ArrayList<>();


    ListStorage(){
        //Läs in sparade kunder från fil
        loadFromFile();
    }

    private void loadFromFile() {

    }

    public void addCustomer(Customer customer){
        customers.add(customer);
        saveToFile();

    }

    private void saveToFile() {

    }

    public Customer findFirstCustomer(String name){
        for (Customer c : customers ) {
            if( c.name.equals(name))
                return c;
        }
        return new Customer(-1,"NoOne");
    }
}
