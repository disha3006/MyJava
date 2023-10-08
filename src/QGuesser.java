import java.util.Random;
import java.util.*;
class game {
    public int num;
    public int rand;

    game() {
        Random r = new Random();
        rand = r.nextInt(100);
    }

    void TakeUserInput() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number");
            num = sc.nextInt();
        }


    void isCorectNumber() {
        if (rand == num) {
            System.out.println("correct guess");
        } else if (rand > num) {
            System.out.println("Too low");
        } else if (rand < num) {
            System.out.println("Too high");
        }

    }
}
    public class QGuesser {
        public static void main(String args[]) {
            game g = new game();
            do {
                g.TakeUserInput();
                g.isCorectNumber();
            } while (g.num != g.rand);
        }
    }

