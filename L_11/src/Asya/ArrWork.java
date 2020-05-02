package Asya;

import java.util.Scanner;

public class ArrWork {
    private int[] intArray;
    private int n;

    public ArrWork(int size) {
        n = size;
        this.intArray = new int[n];
    }

    public void setIntArray() {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
    }

    public void ShowArr() {
        System.out.println("Массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + intArray[i]);
        }
    }

    public void SortArr() {
        for (int i = 0; i < n; i++) {
            int min = intArray[i];
            int min_i = i;
            for (int j = i + 1; j < n; j++) {
                if (intArray[j] < min) {
                    min = intArray[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = intArray[i];
                intArray[i] = intArray[min_i];
                intArray[min_i] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + intArray[i]);
        }
    }
}