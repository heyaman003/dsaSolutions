package recursion.Backtracking;

import java.util.Arrays;

public class backtracking {
       public static void main(String[] args) {
              int arr[][] = new int[3][3];
              printPath(arr, 0, 0, "");
              System.out.println(printPathCount(arr, 0, 0));
              int path[][] = new int[3][3];
              printPathArray(arr, 0, 0, path, 1);
       }

       static void printPath(int[][] arr, int row, int col, String s) {
              if (row == arr.length - 1 && col == arr[0].length - 1) {
                     System.out.println(s);
                     return;
              }
              if (arr[row][col] == 1)
                     return;
              arr[row][col] = 1;
              if (row < arr.length - 1) {
                     printPath(arr, row + 1, col, s + "D");
              }
              if (col < arr[0].length - 1) {
                     printPath(arr, row, col + 1, s + "R");
              }
              if (row > 0) {
                     printPath(arr, row - 1, col, s + "U");
              }
              if (col > 0) {
                     printPath(arr, row, col - 1, s + "L");
              }
              arr[row][col] = 0;
       }

       static void printPathArray(int[][] arr, int row, int col, int path[][], int step) {
              if (row == arr.length - 1 && col == arr[0].length - 1) {
                     path[row][col] = step;
                     for (int[] a : path) {
                            System.out.println(Arrays.toString(a));
                     }
                     System.out.println();
                     return;
              }
              if (arr[row][col] == 1)
                     return;
              path[row][col] = step;
              arr[row][col] = 1;
              if (row < arr.length - 1) {
                     printPathArray(arr, row + 1, col, path, step + 1);
              }
              if (col < arr[0].length - 1) {
                     printPathArray(arr, row, col + 1, path, step + 1);
              }
              if (row > 0) {
                     printPathArray(arr, row - 1, col, path, step + 1);
              }
              if (col > 0) {
                     printPathArray(arr, row, col - 1, path, step + 1);
              }
              path[row][col] = 0;
              arr[row][col] = 0;
       }

       static int printPathCount(int[][] arr, int row, int col) {
              if (row == arr.length - 1 && col == arr[0].length - 1) {
                     return 1;
              }
              if (arr[row][col] == 1)
                     return 0;
              arr[row][col] = 1;
              int l = 0, r = 0, t = 0, d = 0;
              if (row < arr.length - 1) {
                     l = printPathCount(arr, row + 1, col);
              }
              if (col < arr[0].length - 1) {
                     r = printPathCount(arr, row, col + 1);
              }
              if (row > 0) {
                     t = printPathCount(arr, row - 1, col);
              }
              if (col > 0) {
                     d = printPathCount(arr, row, col - 1);
              }
              arr[row][col] = 0;
              return l + t + d + r;
       }
}
