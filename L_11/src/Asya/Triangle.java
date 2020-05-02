package Asya;

class Triangle {
    private int a, b, c;
    public Triangle(int st1, int st2, int st3){
        a = st1;
        b = st2;
        c = st3;
    }
    public void ShowStTriangle(){
        System.out.println("Треугольник:");
        System.out.println("a= " + a + "\nb= " + b + "\nc= " + c);
    }
    public int Perimetr(){
        return a+b+c;
    }
    public double Square(){
        double p = Perimetr()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }


}
