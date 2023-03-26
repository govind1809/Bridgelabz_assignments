package com.bridgelab.review1;

public class StudentInfo {
    private int age;
    private String name;
    private int rollno;
    private char section;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;

    }
    @Override
    public String toString() {
        return "StudentInfo =>> " +
                "age=" + age +
                ", Name= " + name + ", Rollno=" + rollno +
                ", section=" + section;
    }
}



