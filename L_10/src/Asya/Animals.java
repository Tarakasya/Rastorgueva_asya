package Asya;

interface IAnimal{
    boolean run(double distance);
    boolean swim(double distance);
    boolean jump(double high);
}

public abstract class Animals implements IAnimal{
    protected String name;
    protected int age;
    protected double valueRun;
    protected double valueSwim;
    protected double valueJump;
    public void setName(String nickname){
        name = nickname;
    }
    public void setAge (int vozrast){
        age = vozrast;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Animals(String nickname, int vozrast, double valueRun, double valueSwim, double valueJump){
        this.name = nickname;
        this.age = vozrast;
        this.valueRun = valueRun;
        this.valueSwim = valueSwim;
        this.valueJump = valueJump;
    }

    public boolean run(double distance) {
        return (valueRun>=distance);
    }

    public boolean swim(double distance) {
        return (valueSwim>=distance);
    }

    public boolean jump(double high) {
        return (valueJump>=high);
    }
}

class Cat extends Animals {
    public Cat(String nickname, int vozrast) {
        super(nickname, vozrast, 200, 0, 2);

    }
}

class Dog extends Animals {
    public Dog(String nickname, int vozrast) {
        super(nickname, vozrast, 500, 10, 0.5);
    }
}