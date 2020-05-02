package Asya;

public class Main {
    public static void main(String[] args) {
        Shkolnik sh1 = new Shkolnik("Vasya");
        Shkolnik sh2 = new Shkolnik("Petya");

        Student st1  = new Student("Asya");
        Student st2  = new Student("Dana");

        Conference conference = new Conference();
        conference.mashuman.add(sh1);
        conference.mashuman.add(sh2);
        conference.mashuman.add(st1);
        conference.mashuman.add(st2);

        conference.printStud();
        System.out.println();
        conference.printShk();
        System.out.println();
        conference.KolStud();
        conference.KolShk();
    }
}