package com.test;

public class Student {
    String name;
    int age, rollno;
    public Student(String name,int age,int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    @Override
    public String toString() {
        return (" student details are as follows\n name:" + name +
         " age:" + age + " rollno:" + rollno);

    }
    public static void main(String[] args) {
        Student st1 = new Student("Ram",12,101);
        System.out.println(st1.toString());

    }

}
