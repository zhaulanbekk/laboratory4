package com.company;

public class Student {
    private String studentName;
    private int studentYear;

    public Student() {

    }

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentYear = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentYear;
    }

    public void setStudentAge(int studentAge) {
        this.studentYear = studentAge;
    }

    @Override
    public String toString() {
        return "\n=|Student: |=" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentYear +
                '}';
    }
}
