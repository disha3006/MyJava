class Base1 {
    Base1() {
        System.out.println("This is a constructor");
    }
    Base1(int a , int b) {
        System.out.println("This is a parametrised base class const having a,c = " + a + " " + b);
    }
}
class Derived1 extends Base1 {
    Derived1() {
        System.out.println("This is a derived constructor");
    }
    Derived1(int a , int c){
        super(a,c);
        System.out.println("This is parametrised derived class const having value c =" + c);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1(3,5);
    }
}