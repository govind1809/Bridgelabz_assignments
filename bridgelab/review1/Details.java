package com.bridgelab.review1;

import java.util.ArrayList;

public class Details {
    public static void main(String[] args) {
        System.out.println("The Details of Students: ");
        StudentInfo stu1 = new StudentInfo();
        stu1.setAge(29);
        stu1.setName("Govind");
        stu1.setRollno(1);
        stu1.setSection('A');
        System.out.println(stu1);

        StudentInfo stu2 = new StudentInfo();
        stu2.setAge(28);
        stu2.setName("Vipin");
        stu2.setRollno(2);
        stu2.setSection('A');
        System.out.println(stu2);

        StudentInfo stu3 = new StudentInfo();
        stu3.setAge(27);
        stu3.setName("Naresh");
        stu3.setRollno(3);
        stu3.setSection('A');
        System.out.println(stu3);

        ArrayList<StudentInfo> data = new ArrayList<StudentInfo>();
        data.add(stu1);
        data.add(stu2);
        data.add(stu3);
        System.out.println(data);
    }
}

