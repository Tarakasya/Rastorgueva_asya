package Asya;

class People {
    protected String name, lastName;
    protected int age;

    People(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    static People Human = new People("Asya", "Rastorgueva", 21);

    public static void main(String[] args) {
        walk();
        voice();
        run();
        Teacher.teach();
        Student.learn();
    }
    static void walk(){
        System.out.println(Human.name + " is walking");
    }
    static void voice(){
        System.out.println(Human.name + " is saying: hi!");
    }
    static void run(){
        System.out.println(Human.name + " is running");
    }
}

class Student extends People{
    public Student(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    static void learn(){
        System.out.println(Human.name + " is learning");
    }
}

class Teacher extends People{
    public Teacher(String name, String lastName, int age){
        super(name, lastName, age);
    }
    static void teach(){
        System.out.println(Human.name + " is teaching");
    }
}
