package files;

import ovn2.Person;

import java.io.Serializable;
import java.util.ArrayList;

public class Storage implements Serializable {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Person> customers = new ArrayList<Person>();
}
