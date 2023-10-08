import java.util.*;
public class QSumTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enyer size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers in ur array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is " + Arrays.toString(arr));
        System.out.println("Enter the target");
        int target = sc.nextInt();

        for(int i = 0 ; i<size ; i++) {
            for(int j = 0 ; j<size; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print(i + "" +  j);
                }
            }
        }
    }
}
