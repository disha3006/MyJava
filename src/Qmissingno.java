import java.util.*;

public class Qmissingno {
    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 5, 0};
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr.length && arr[i] != arr[arr[i]]) {
                int temp = arr[i];
                arr[arr[i]] = arr[i];
                arr[temp] = temp;
            } else {
                i++;
            }
        }

            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index) {
                    System.out.println(index);
                    break;
                }

            }
        }
    }
