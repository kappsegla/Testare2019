package ovn2;

import oop.Adress;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        House myHouse = new House(120,1,1000000,1995,new Adress("Skogen","Lingonstigen", 1));
        House myHouse2 = new House(60,2,3000000,2017,new Adress("Göteborg","Maskingatan", 5));
//        System.out.println(myHouse);

        Person pelle = new Person("Pelle","Crash test Dummy", 27, 184, Sex.OTHER, myHouse);

        persons.add(pelle);
        persons.add( new Person("Kalle","Doctor", 45, 178, Sex.MALE, myHouse2));
        persons.add( new Person("Lotta","Salesperson", 32, 165, Sex.FEMALE, myHouse2));

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}
