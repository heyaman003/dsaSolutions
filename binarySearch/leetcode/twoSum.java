package binarySearch.leetcode;

import java.util.Scanner;

public class twoSum {
             public static void main(String[] args) {
              int n;
              System.out.print("enetr the no of element :");
              Scanner sc = new Scanner(System.in);
              n = sc.nextInt();
              int numbers[] = new int[n];
              for (int i = 0; i < n; i++) {
                     numbers[i] = sc.nextInt();
              }
              System.out.println(binarySearch(numbers, 40));
       }

       static int[] binarySearch(int numbers[], int target) {
              int low = 0;
              int high = numbers.length - 1;
              int result[]={-1,-1};
              while (low<high) {
                     int mid = low + (high - low) / 2;
                     if (numbers[low]+numbers[high]==target) {
                            result[0]=low+1;
                            result[1]=high+1;
                            return result;
                            
                     } else if (target > numbers[low]+numbers[high]) {
                             low=mid+1;
                     }
                     else if(target<numbers[low]+numbers[high]){
                            high=mid-1;
                     }
              }
              return result; 
       }
}
