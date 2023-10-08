import java.util.*;
public class LlinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enyer size of array");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the numbers in ur array");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("your array is " + Arrays.toString(arr));
//        System.out.println("Enter the number to find");
//        int num = sc.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            if (arr[i] == num) {
//                System.out.println(i);
//            }
//        }


//     FOR RANGE
//        for(int i = 1; i<4 ; i++) {
//            if(arr[i] == num){
//                System.out.println(i);
//            } else
//                System.out.println("Not found");
//        }

//FOR 2D ARRAY
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr1 = new int[row][col];
        System.out.println("Enter the numbers in ur array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("your array is " + Arrays.toString(arr1));
        System.out.println("Enter the number to find");
        int no = sc.nextInt();
    }
}
