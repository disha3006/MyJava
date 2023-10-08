import java.lang.reflect.Array;

class floors {
    static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = Array.getLength(arr)-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                return mid;
        }
        return arr[end];

    }
}

public class Qfloor{
    public static void main(String[] args) {
        int[] arr = {1 , 3 , 5, 7 , 9};
        int target = 9;

        floors b1 = new floors();
        int ans = b1.binarySearch(arr,8);
        System.out.println(ans);
    }
}




