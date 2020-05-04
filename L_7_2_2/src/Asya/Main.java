package Asya;

import java.io.*;
import java.util.Scanner;

class Car implements Serializable {
    String model, reg_nomer;
    int god_vypuska, probeg, stoimost;
}

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner (System.in, "cp1251");

        File f = new File ("Cars.txt");
        f.createNewFile();

        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Введите количество автомобилей:");
        int k = sc.nextInt();
        sc.nextLine();

        System.out.println("Информация об автомобилях: ");
        for (int i = 0; i < k; i++) {
            Car car = new Car();

            System.out.print("Введите модель " + (i+1) + "-го автомобиля: ");
            car.model = sc.nextLine();

            System.out.print("Введите регистрационный номер " + (i+1) + "-го автомоблия: ");
            car.reg_nomer = sc.nextLine();

            System.out.print("Введите год выпуска " + (i+1) + "-го автомобиля: ");
            car.god_vypuska = sc.nextInt();

            System.out.print("Введите пробег " + (i+1) + "-го автомобиля: ");
            car.probeg = sc.nextInt();

            System.out.print("Введите стоимость " + (i+1) + "-го автомобиля: ");
            car.stoimost = sc.nextInt();

            oos.writeObject(car);
            sc.nextLine();
        }
        oos.flush();
        oos.close();
        fos.close();
        sc.close();

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream oin = new ObjectInputStream(fis);
        Car car;
        System.out.println ("Модель \t Регистрационный номер \t Год выпуска \t Пробег \t Стоимость");
        for (int i = 0; i < k; i++) {
            car = (Car) oin.readObject();
            System.out.println(car.model + " " + car.reg_nomer + " " + car.god_vypuska + " " + car.probeg + " " + car.stoimost);
        }
        oin.close();
        fis.close();

        File f2 = new File("CarsOut.txt");
        if (f2.exists()) f2.delete();
        f2.createNewFile();

        FileOutputStream fos2 = new FileOutputStream(f2);
        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
        FileInputStream fis2 = new FileInputStream(f);
        ObjectInputStream oin2 = new ObjectInputStream(fis2);
        System.out.println("Автомобили с годом выпуска позднее 2009: ");
        for (int i = 0; i < k; i++) {
            car = (Car) oin2.readObject();
            if (car.god_vypuska > 2009) {
                oos2.writeObject(car);
                System.out.println(car.model + " " + car.reg_nomer + " " + car.god_vypuska + " " + car.probeg + " " + car.stoimost);
            }
        }
        oin2.close();
        fis2.close();
        oos2.flush();
        oos2.close();
        fos2.close();
    }
}
