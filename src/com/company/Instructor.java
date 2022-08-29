package com.company;

public class Instructor {
    private String instructorName;
    private int instructorAge;
    private String groupOfInstructor;

    public Instructor() {
    }

    public Instructor(String instructorName, int instructorAge, String groupOfInstructor) {
        this.instructorName = instructorName;
        this.instructorAge = instructorAge;
        this.groupOfInstructor = groupOfInstructor;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getInstructorAge() {
        return instructorAge;
    }

    public void setInstructorAge(int instructorAge) {
        this.instructorAge = instructorAge;
    }

    public String getGroupOfInstructor() {
        return groupOfInstructor;
    }

    public void setGroupOfInstructor(String groupOfInstructor) {
        this.groupOfInstructor = groupOfInstructor;
    }

    @Override
    public String toString() {
        return "\n==>Instructor<==" +
                "instructorName='" + instructorName + '\'' +
                ", instructorAge=" + instructorAge +
                ", groupOfInstructor='" + groupOfInstructor + '\'';
    }
}
