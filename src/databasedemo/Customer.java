package databasedemo;

import org.dizitart.no2.objects.Id;

import java.io.Serializable;

public class Customer implements Serializable {

    int id;
    String name;

    Customer(){}

    Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer { id: " + id + " name: " + name + "}";
    }
}
