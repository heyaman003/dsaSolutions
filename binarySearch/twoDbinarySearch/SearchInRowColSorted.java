package binarySearch.twoDbinarySearch;

import java.util.Arrays;

public class SearchInRowColSorted {
       public static void main(String[] args) {
              int [][]  matrix={
                     {1,2,3,4,5,6},
                     {7,8,9,10,11,12},
                     {13,14,15,16,16,18},
                     {19,20,21,22,23,24},
                     {25,26,27,28,29,30}
              };
              System.out.println(Arrays.toString(NormalSearch(matrix, 5, 6, 34)));
       }
       static int [] NormalSearch(int arr[][],int m,int n,int target){
                 int Rowstart=0;
                 int colEnd=n-1;
                 while(Rowstart<m && colEnd>0){
                       if(arr[Rowstart][colEnd]==target)
                       return new int[]{Rowstart,colEnd};
                       else if(target>arr[Rowstart][colEnd])
                       Rowstart++;
                       else
                       colEnd--;
                 }
                 return new int[]{-1,-1};
       }
       static boolean binaryWay(int matrix[][], int m,int n,int target){

              
              if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                     return false;
                 }
                 
                 int rows = matrix.length;
                 int cols = matrix[0].length;
                 int left = 0;
                 int right = rows * cols - 1;
                 
                 while (left <= right) {
                     int mid = left + (right - left) / 2;
                     int midValue = matrix[mid / cols][mid % cols];
                     
                     if (midValue == target) {
                         return true;
                     } else if (midValue < target) {
                         left = mid + 1;
                     } else {
                         right = mid - 1;
                     }
                 }
                 
                 return false;

       }
}
