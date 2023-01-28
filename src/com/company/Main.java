package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Person> personArrayList = new ArrayList<Person>();

        //personArrayList.add(new Person("Unknown username", "unknown name", "unknown surname", 0));
        personArrayList.add(new Teacher("nkhaimuldin", "Nursultan", "Khaimuldin", 31, "Object-oriented programming"));
        personArrayList.add(new Student("222111", "Almas", "Erkenov", 18, 3.4));



        for (Person p: personArrayList) {
            System.out.println(p);
            p.eat();
            p.sleep();

        }


    }
}