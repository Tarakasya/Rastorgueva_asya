package Asya;

public class Main {

    public static void main(String[] args) {

        Cat c = new Cat ("Meow",3);
        System.out.println(c.getName() + " is running 250m: " + c.run(250));
        System.out.println(c.getName() + " is swimming 20m: " + c.swim(20));
        System.out.println(c.getName() + " is jumping 1m: " + c.jump(1));

        Dog d = new Dog ("Woof", 4);
        System.out.println(d.getName() + " is running 210m: " + d.run(210));
        System.out.println(d.getName() + " is swimming 3m: " + d.swim(3));
        System.out.println(d.getName() + " is jumping 0.5m: " + d.jump(0.5));
    }
}
