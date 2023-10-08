import java.util.Arrays;

class matrx {
    int[] Search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;                   //as r=c , if r!=c then do matrix[0].length

        while (r < matrix.length && c >= 0) {
            if (target == matrix[r][c]) {
                return new int[]{r, c};
            }
            if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }

        }
        return new int[]{-1, -1};
    }
}
public class Q2DArrsearch {
    public static void main(String[] args) {
                int[][] matrix = {{10 , 20 , 30, } ,
                        { 15 , 25 , 35 , } ,
                        {22 , 27, 37 , }};
                matrx m = new matrx();
                int[] ans = m.Search(matrix , 35);
                System.out.println(Arrays.toString(ans));
            }
     }
