package ovn2;

import oop.Adress;

public class Main {


    public static void main(String[] args) {

        House myHouse = new House(120,1,1000000,1995,new Adress("Skogen","Lingonstigen", 1));

        System.out.println(myHouse);

        Person pelle = new Person("Pelle","Crash test Dummy", 27, 184,Person.MALE);

        System.out.println(pelle);
    }
}
