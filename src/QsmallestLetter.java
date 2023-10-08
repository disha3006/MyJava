import java.lang.reflect.Array;

class smalllet {
    static String binarySearch(String[] arr, String target) {
        int start = 0;
        int end = Array.getLength(arr)-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid].compareTo(target) > 0){
                end = mid - 1;
            } else if  ( (arr[mid].compareTo(target) < 0)) {
                start = mid + 1;
            }

        }
        return arr[start];


    }
}

public class QsmallestLetter{
    public static void main(String[] args) {
        String [] arr = {"c", "d", "e", "g"};
        String target = "e";

       smalllet  b1 = new smalllet();
        String ans = b1.binarySearch(arr,"g");
        System.out.println(ans);
    }
}




