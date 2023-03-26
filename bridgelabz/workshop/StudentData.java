package com.bridgelabz.workshop;

public class StudentData {
    private int age;
   private String studentName;
   private int id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentData =>" +
                "age=" + age +
                ", studentName='" + studentName + '\'' +
                ", id=" + id;
    }
}
