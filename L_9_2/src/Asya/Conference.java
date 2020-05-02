package Asya;

import java.util.ArrayList;

class Shkolnik extends Uchashiisya{
    public Shkolnik(String human){
        super(human);
    }
}

class Student extends Uchashiisya{
    public Student(String human){
        super(human);
    }
}


public class Conference {
    public ArrayList<Uchashiisya> mashuman = new ArrayList<Uchashiisya>();

    public void addShk(Uchashiisya O) {
        mashuman.add(O);
    }
    public void printStud() {
        System.out.println("Студенты: ");
        for (Uchashiisya a:mashuman){
            if (a instanceof Student) {
                System.out.println(a);
            }
        }
    }
    public void printShk() {
        System.out.println("Школьникики: ");
        for (Uchashiisya a:mashuman){ //
            if (a instanceof Shkolnik) System.out.println(a);
        }
    }
    public void KolStud() {
        int n = 0;
        for (Uchashiisya a : mashuman) {
            if (a instanceof Student) {
                n++;
            }
        }
        System.out.println("Студентов: " + n);
    }
    public void KolShk() {
        int k = 0;
        for (Uchashiisya a : mashuman) {
            if (a instanceof Shkolnik) {
                k++;
            }
        }
        System.out.println("Школьников: " + k);
    }
}

