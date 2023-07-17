/*- Given an unsorted array arr[] of size N having both negative and positive integers, place
all negative elements at the end of array without changing the order of positive elements
and negative elements
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
1 3 2 11 6 -1 -7 -5

N = 4
arr[] = {-3, -1, 0, -7}
0 -3 -1 -7*/

package anuj;

import java.util.Arrays;

public class sortarray {
       public static void main(String[] args) {
              int arr[]={1, -1, 3, 2, -7, -5, 11, 6 };
              int left=0;
              int right=arr.length-1;
              while (left <= right) {
                     if (arr[left] >= 0) {
                         left++;
                     } else if (arr[right] < 0) {
                         right--;
                     } else {
                         int temp = arr[left];
                         arr[left] = arr[right];
                         arr[right] = temp;
                         left++;
                         right--;
                     }
                 }
       System.out.println(Arrays.toString(arr));
}
}
