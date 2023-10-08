import java.util.Scanner;

public class Qset0matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[3][3];
        int i , j;
        for ( i = 0; i < 9; i++) {
            for (j = 0; j < ar[i].length; j++) {
                ar[i][j] = sc.nextInt();
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }

        }
    }
