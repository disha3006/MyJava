abstract class Vehicle {
     void displayName() {
         System.out.println("the vehicle class");
     }

    void SpeedUp() {

    }

    void Brakes() {

    }
}
class car extends Vehicle {
     void SpeedUp() {

         System.out.println("It goes vrrrrrrrrrrrooooooooooooom");
     }
     void Brakes() {
         System.out.println("It does keeeeeeeeeeek");
     }
}

public class Labstracts1 {
     public static void main(String args[]) {
         car c = new car();
         c.Brakes();
         c.SpeedUp();
        }
        }


