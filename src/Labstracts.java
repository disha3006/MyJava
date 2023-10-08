import java.util.* ;
abstract class Shape {
    void Name() {
        System.out.println("The Shape class");
    }
    abstract double area();
    }
    class Rectangle extends Shape {
     void Display() {
         System.out.println("This is rectangle");
     }
      double area() {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter length breadth");
         int a = sc.nextInt() ;
         int b = sc.nextInt();
         return a*b ;

      }
    }
    class Circle extends Shape {
    void Print() {
        System.out.println("This is a circle");
    }

    double area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        int r = sc.nextInt();
        return 3.14 * r * r;
    }
    }

    public class Labstracts {
    public static void main (String args []) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();


        r.Display();
        c.Print();
        c.Name();
        System.out.println("Area is :" + r.area());
        System.out.println("Area is :" + c.area());
    }
    }