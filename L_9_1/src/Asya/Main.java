package Asya;

import java.util.ArrayList;

class Auto {
    private String firm;
    private int maxSpeed;
    private String num;
    public void setFirm(String firma) {
        firm = firma;
    }
    public void setMaxSpeed(int speed) {
        maxSpeed = speed;
    }
    public void setNum(String number)
    {
        num = number;
    }
    public String getNum(){
        return num;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm()
    {
        return firm;
    }
    public Auto()
    {
        firm="Без названия ";
        maxSpeed=0;
        num = "ABC ";
    }
    public Auto(String firma, int speed, String number)
    {
        firm=firma;
        maxSpeed=speed;
        num = number;
    }
}



class GarageCar {
    private ArrayList<Auto> masCar = new ArrayList<Auto>();
    public void addCar(Auto m)
    {
        masCar.add(m);
    }
    public GarageCar (){

    }
    public Boolean findCar(Auto m)
    {
        return masCar.contains(m);
    }

    public GarageCar(ArrayList<Auto> n)
    {
        masCar = n;
    }
    public void printGarage()
    {
        System.out.println("В гараже: ");
        for(Auto a:masCar)
        {
            System.out.println("\t"+a.toString());
        }
    }
    public void DELETE(){
        int index = 0;
        masCar.remove(index);
    }
}



public class Main {
    public static void main(String[] args) {
        GarageCar MyGarage = new GarageCar();
        Car myCar1 = new Car("Ford", 200, "XXX", "Mustang", 2, false);
        MyGarage.addCar(myCar1);
        Truck myTruck = new Truck("Dove", 160,"XXX","DTS", 700, true);
        MyGarage.addCar(myTruck);
        MyGarage.printGarage();
        if (MyGarage.findCar(myCar1)) {
            MyGarage.DELETE();
        } else {
            System.out.println("Нет");
        }
        MyGarage.printGarage();
    }
}
