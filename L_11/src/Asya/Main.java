package Asya;

public class Main {

    public static void main(String[] args) {

        Triangle tr = new Triangle(5, 6, 4);
        tr.ShowStTriangle();
        System.out.println("Периметр треугольника: " + tr.Perimetr());
        System.out.println("Площадь треугольника: " + tr.Square());

        Rectangle rec = new Rectangle(5, 4);
        rec.ShowStRectangle();
        System.out.println("Периметр прямоугольника: " + rec.PerimetrRec());
        System.out.println("Площадь прямоугольника: " + rec.SquareRec());

        ArrWork arr = new ArrWork(5);
        arr.setIntArray();
        arr.ShowArr();
        System.out.println("\nОтсортированный массив: ");
        arr.SortArr();

    }
}
