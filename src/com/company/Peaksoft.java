package com.company;

import java.util.Arrays;

public class Peaksoft {
    private Group[] groups;
    private Student[] students;
    private Mentor[] mentors;
    private Instructor[] instructors;

    public Peaksoft() {
    }

    public Peaksoft(Group[] groups, Student[] students, Mentor[] mentors, Instructor[] instructors) {
        this.groups = groups;
        this.students = students;
        this.mentors = mentors;
        this.instructors = instructors;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    @Override
    public String toString() {
        return "\n\t))))Peaksoft((((" +

                "\n\t\t=groups=" + Arrays.toString(groups) +
                ",\n\t\t =students=" + Arrays.toString(students) +
                ", \n\t\t=mentors=" + Arrays.toString(mentors) +
                ", \n\t\t=instructors=" + Arrays.toString(instructors) ;
    }
}
