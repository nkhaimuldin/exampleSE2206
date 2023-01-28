package com.company;

public abstract class Person implements IPerson{
    private int id;
    private static int id_gen = 1;
    private String username;
    private String name;
    private String surname;
    private int age;

    public Person(){
        id = id_gen++;
    }

    public Person(String username, String name, String surname, int age){
        this();
        setUsername(username);
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return id + ": " + username + " " + name + " " + surname + " " + age;
    }

}