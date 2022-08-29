package com.company;

public class Mentor {
    private String mentorName;
    private int mentorAge;
    private String groupOfMentors;

    public Mentor() {
    }

    public Mentor(String mentorName, int mentorAge, String groupOfMentors) {
        this.mentorName = mentorName;
        this.mentorAge = mentorAge;
        this.groupOfMentors = groupOfMentors;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public int getMentorAge() {
        return mentorAge;
    }

    public void setMentorAge(int mentorAge) {
        this.mentorAge = mentorAge;
    }

    public String getGroupOfMentors() {
        return groupOfMentors;
    }

    public void setGroupOfMentors(String groupOfMentors) {
        this.groupOfMentors = groupOfMentors;
    }

    @Override
    public String toString() {
        return "\n<--Mentor-->" +
                "mentorName='" + mentorName + '\'' +
                ", mentorAge=" + mentorAge +
                ", groupOfMentors='" + groupOfMentors + '\'' +
                '}';
    }
}
