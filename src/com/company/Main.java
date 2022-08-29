package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Group group=new Group("Java-6");
        Group group2=new Group("Java-5");
        Group group3=new Group("Java-4");
        Group group4=new Group("JS-6");
        Group group5=new Group("JS-5");
        Group group6=new Group("JS-4");

        Group[]groups=new Group[]{group,group2,group3,group4,group5,group6};

        Student student = new Student("Jaulanbek",34);
        Student student2 = new Student("Dastan",34);
        Student student3 = new Student("Nurdin",34);
        Student student4 = new Student("Datka",34);
        Student student5 = new Student("Nurtilek",34);
        Student student6 = new Student("Guljan",34);
        Student student7 = new Student("Ulan",34);
        Student student8 = new Student("Nurbek",34);
        Student student9 = new Student("Aziza",34);
        Student student10 = new Student("Ayzada",34);
        Student student11 = new Student("Klara",34);
        Student student12 = new Student("Tynchtyk",34);
        Student student13 = new Student("Sunat",34);
        Student student14 = new Student("Maksat",34);
        Student student15 = new Student("Nursultan",34);

        Student[]students=new Student[]{student,student2,student3,student4,student5,student6,student7,student8,student9,student10,student11,student12,student13,student14,student15};

        Mentor mentor=new Mentor("Aijamal",27,"Java-6");
        Mentor mentor2=new Mentor("Nursultan",24,"JS-6");
        Mentor mentor3=new Mentor("Maksat",29,"Java-6");
        Mentor mentor4=new Mentor("Cyngyz",30,"Java-6");
        Mentor mentor5=new Mentor("Sakydin",24,"JS-6");
        Mentor mentor6=new Mentor("Zhaulanbek",22,"Java-6");
        Mentor mentor7=new Mentor("Jaulanbek",22,"JS-6");

        Mentor[]mentors=new Mentor[]{mentor,mentor2,mentor3,mentor4,mentor5,mentor6,mentor7};

        Instructor instructor=new Instructor("Muhammed",24,"Java-6");
        Instructor instructor2=new Instructor("Muhammed",24,"Java-6");
        Instructor instructor3=new Instructor("Muhammed",24,"Java-6");
        Instructor instructor4=new Instructor("Muhammed",24,"Java-6");
        Instructor instructor5=new Instructor("Muhammed",24,"Java-6");

        Instructor[] instructors=new Instructor[]{instructor,instructor2,instructor3,instructor4,instructor5};

        Peaksoft peaksoft=new Peaksoft(groups,students,mentors,instructors);
        System.out.println(peaksoft);






    }
}
