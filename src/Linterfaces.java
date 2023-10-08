interface Shapes {
    static double pi = 3.14;

    public void getarea();
}
class triangle implements Shapes {
    int height = 4;
    int base = 2;

    public void getarea(){
        System.out.println(0.5*base*height);
    }
}
class circle implements Shapes{
    double radius = 2;
    public void getarea(){
        System.out.println(radius*radius*pi);
    }

}


public class Linterfaces {
    public static void main(String[] args) {
        circle c = new circle();
        triangle t = new triangle();

        t.getarea();
        c.getarea();
    }
}



