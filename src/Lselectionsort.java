import java.util.*;
public class Lselectionsort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter nos to ur array");

        for (int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is " + Arrays.toString(arr));

        //find max elemrnt from an array
        for(int x = 0 ; x< size ; x++){
            int smallest = x;
            for(int y = x+1; y<size ; y++) {
                if(arr[smallest] > arr[y]){
                    smallest = y;
                    int temp = arr[smallest];
                    arr[smallest]= arr[x];
                    arr[x]= temp;
                }
            }
        }
        System.out.println("MAx elemnt of arr is : " + Arrays.toString(arr));
    }
}
