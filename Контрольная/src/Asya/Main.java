package Asya;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("First exercise:");
        System.out.println("a?");
        int a = sc.nextInt();
        System.out.println("b?");
        int b = sc.nextInt();
        System.out.println(First_exercise(a, b));
        System.out.println("Second exercise:");
        Second_exercise();
        System.out.println("\nThird exercise:");
        Third_exercise();
    }

    private static boolean First_exercise (int h, int j){
        return ((h + j) >= 10) & ((h + j) <= 20);
    }

    private static void Second_exercise(){
        int[] arr = new int[8];
        for (int i =0; i<8; i++){
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
    }

    private static void Third_exercise(){
        int[] arr = {1, 5, 3 ,2 ,11, 4, 5, 2, 4, 8, 9, 1};
        for (int value : arr) {
            if (value < 6) {
                value *= 2;
            }
            System.out.print(value + " ");
        }
    }
}