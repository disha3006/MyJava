import java.util.*;
public class Lloops {
public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x>18) {
        System.out.println("The person is Adult");
    }
    else {
        System.out.println("The person is not adult");
    }

    //for loops

    for(int i =0 ; i<11 ; i++) {
        System.out.println(i);
    }
}
}