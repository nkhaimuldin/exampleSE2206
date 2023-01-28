package com.company;

public class Teacher extends Person implements ITeacher{
    private String courseName;

    public Teacher(){
        super();
    }

    public Teacher(String username, String name, String surname, int age, String courseName){
        super(username, name, surname, age);
        setCourseName(courseName);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void eat() {
        System.out.println("Eats normal food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps well");
    }

    @Override
    public String toString() {
        return super.toString() + " " + courseName;
    }

    @Override
    public void getSalary() {
        System.out.println("Salary sent to BankAccount");
    }

    @Override
    public void checkAssignments() {
        System.out.println("Teacher checks assignment");
    }

    public void teach(){
        System.out.println("At lab classes");
    }
}