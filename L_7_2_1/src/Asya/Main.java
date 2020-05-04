package Asya;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File ("Cars.txt");
        if (f1.exists ( )) f1.delete ( );
        f1.createNewFile ( );
        RandomAccessFile rf = new RandomAccessFile (f1, "rw");
        Scanner sc = new Scanner (System.in);
        System.out.println ("Введите количество автомобилей:");
        int k = sc.nextInt ( );
        sc.nextLine ( );
        String model, reg_nomer;
        int god_vypuska, probeg, stoimost;
        rf.seek (0);
        for (int i = 0; i < k; i++) {
            System.out.println ("Введите модель " + (i+1) + " автомобиля:");
            model = sc.next ( );
            rf.writeUTF (model);
            for (int j = 0; j < 20 - model.length ( ); j++)
                rf.writeByte (1);
            System.out.println ("Введите регистрационный номер автомобиля:");
            reg_nomer = sc.next ( );
            rf.writeUTF (reg_nomer);
            System.out.println ("Введите год выпуска автомобиля:");
            god_vypuska = sc.nextInt ( );
            rf.writeInt (god_vypuska);
            System.out.println ("Введите пробег автомобиля:");
            probeg = sc.nextInt ( );
            rf.writeInt (probeg);
            System.out.println ("Введите стоимость автомобиля:");
            stoimost = sc.nextInt ( );
            rf.writeInt (stoimost);
        }
        System.out.println (rf.length ( ));
        rf.seek (0);
        System.out.println ("Информация об автомобилях:");
        System.out.println ("Модель \t\t Регистрационный номер \t\t Год выпуска \t\t Пробег \t\t Стоимость");
        for (int i = 0; i < k; i++) {
            model= rf.readUTF ( );
            for (int j = 0; j < 20 - model.length ( ); j++)
                rf.readByte ( );
            reg_nomer = rf.readUTF ( );
            god_vypuska = rf.readInt ( );
            probeg = rf.readInt ( );
            stoimost = rf.readInt ( );
            System.out.println (model + " " + reg_nomer + " " + god_vypuska + " " + probeg + " " + stoimost);
        }
        File f2 = new File ("CarsOut.txt");
        if (f2.exists ( )) f2.delete ( );
        f2.createNewFile ( );
        RandomAccessFile rf2 = new RandomAccessFile (f2, "rw");
        rf.seek (0);
        rf2.seek (0);
        String model2, reg_nomer2;
        int god_vypuska2, probeg2, stoimost2;

        int kk = 0;
        for (int i = 0; i < k; i++) {
            model2 = rf.readUTF ( );
            for (int j = 0; j < 20 - model2.length ( ); j++)
                rf.readByte ( );
            reg_nomer2 = rf.readUTF ( );
            god_vypuska2 = rf.readInt ( );
            probeg2 = rf.readInt ( );
            stoimost2 = rf.readInt ( );
            if (god_vypuska2 > 2009) {
                kk++;
                rf2.writeUTF (model2);
                for (int j = 0; j < 20 - model2.length ( ); j++)
                    rf2.writeByte (1);
                rf2.writeUTF (reg_nomer2);
                rf2.writeInt (god_vypuska2);
                rf2.writeInt (probeg2);
                rf2.writeInt (stoimost2);
            }
        }
        rf.close ( );
        System.out.println ("Автомобили с годом выпуска позднее 2009:");
        rf2.seek (0);
        for (int i = 0; i < kk; i++) {
            model2 = rf2.readUTF ( );
            for (int j = 0; j < 20 - model2.length ( ); j++)
                rf2.readByte ( );
            reg_nomer2 = rf2.readUTF ( );
            god_vypuska2 = rf2.readInt ( );
            probeg2 = rf2.readInt ( );
            stoimost2 = rf2.readInt ( );
            System.out.println (model2 + " " + reg_nomer2 + " " + god_vypuska2 + " " + probeg2  + " " + stoimost2);
        }
        rf2.close ( );
    }
}
