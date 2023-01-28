package com.company;

public final class Student extends Person{
    private double gpa;

    public Student(){
        super();
    }

    public Student( String username, String name, String surname, int age, double gpa){
        this(); //calling no arg constructor
        setName(name);
        setSurname(surname);
        setAge(age);
        setGpa(gpa);
        setUsername(username);
    }


    public double getGpa() {
        return gpa;
    }


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void eat() {
        System.out.println("Eats junk food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps not well");
    }

    @Override
    public String toString() {
        return super.toString() +" " + gpa;
    }
}
