package Asya;

public class Rectangle {
    private int a, b;
    public Rectangle(int st1, int st2){
        a = st1;
        b = st2;
    }
    public void ShowStRectangle(){
        System.out.println("Прямоугольник:");
        System.out.println("a= " + a + "\nb= " + b);
    }
    public int PerimetrRec(){
        return (a+b)*2;
    }
    public int SquareRec(){
        return a*b;
    }
}

