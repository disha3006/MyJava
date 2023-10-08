import java.util.*;

public class LbubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size] ;
        System.out.println("Enter the numbers in ur array");
        for(int i = 0 ; i<size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is " + Arrays.toString(arr));

        for (int x = 0 ; x<size ;x++){
            for(int y = x+1 ; y<size ; y++){
                if(arr[x]> arr[y]) {
                        int temp = arr[x];
                        arr[x] = arr[y];
                        arr[y]= temp;
            }
        }
    }System.out.println("your sorted array is " + Arrays.toString(arr));
}
}