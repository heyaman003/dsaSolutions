package twodMatrix;

import java.util.Arrays;

public class rotation90deg {
       public static void main(String[] args) {
              int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,16,17}};
              mat=bruteForceRotateMatrix(mat);
             for (int i = 0; i < mat.length; i++) {
             for (int j = 0; j < mat.length; j++) {
              System.out.println(mat[i][j]);
                 
             }
             }
       }
       static int[][] bruteForceRotateMatrix(int mat[][]) {
              int n = mat.length;
              int ans[][] = new int[n][n];
              
              for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                      ans[n - j - 1][i] = mat[i][j];
                  }
              }
              
              return ans;
          }
          
}
