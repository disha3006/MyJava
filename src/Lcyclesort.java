import java.util.Arrays;
import java.util.Scanner;

public class Lcyclesort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter nos to ur array");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is " + Arrays.toString(arr));
        int i = 0;
        while(i < arr.length){
            int correctindex = arr[i] - 1;
            if (arr[i] != arr[correctindex]){
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex]= temp;
            }

            else i++;

        }

    }
}