package anuj;

import java.util.Arrays;

public class sumSubsequence {
       public static void main(String[] args) {
              int arr[]={4,5,1,4,8,9,0};
              System.out.println(Arrays.toString(subarr(arr, 9)));
       }
       static int [] subarr(int arr[],int target){
              int start=0;
              int end=0;
              int sum=0;
              while (start <= end && end < arr.length) {
                     if (sum == target) {
                         return new int[]{start, end};
                     } else if (sum < target) {
                         end++;
                         if (end < arr.length) {
                             sum =sum+arr[end];
                             if (sum == target) 
                         return new int[]{start, end};
                         }
                     } else {
                         sum =sum- arr[start];
                            if (sum == target) 
                         return new int[]{start+1, end};
                         start++;
                     }
                 }
                 return new int[]{-1, -1};
       }
}

