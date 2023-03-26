package com.bridgelabz.workshop;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        StudentData stu1 = new StudentData();
        stu1.setAge(23);
        stu1.setStudentName("Govind");
        stu1.setId(1);
        System.out.println(stu1);
        StudentData stu2 = new StudentData();
        stu2.setAge(22);
        stu2.setStudentName("Vipin");
        stu2.setId(2);
        System.out.println(stu2);
        StudentData stu3 = new StudentData();
        stu3.setAge(21);
        stu3.setStudentName("Naresh");
        stu3.setId(3);
        System.out.println(stu3);
        StudentData stu4 = new StudentData();
        stu4.setAge(23);
        stu4.setStudentName("Anshul");
        stu4.setId(4);
        System.out.println(stu4);
        StudentData stu5 = new StudentData();
        stu5.setAge(24);
        stu5.setStudentName("Rishu");
        stu5.setId(5);
        System.out.println(stu5);

        ArrayList<StudentData> student = new ArrayList<StudentData>();
        student.add(stu1);
        student.add(stu2);
        student.add(stu3);
        student.add(stu4);
        student.add(stu5);
        System.out.println(student);
    }
}