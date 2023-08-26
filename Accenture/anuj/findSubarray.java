

import java.util.Arrays;

public class findSubarray {
       public static void main(String[] args) {
              int arr[] = { 10, 6, 5, 3, 2, 19 };
              int target = 5;
              System.out.println(Arrays.toString(finding(arr, target)));

       }

       static int[] finding(int arr[], int target) {
              int start = 0;
              int end = 0;
              int sum = arr[0];
              while (start < arr.length && end < arr.length) {
                     if (sum == target)
                            return new int[] { start, end };
                     else if (sum > target) {
                            sum = sum - arr[start];
                            start++;

                     } else if (sum < target) {
                            if (end < arr.length - 1) {
                                   end++;
                                   sum += arr[end];
                            }
                            else {
                                   sum -= arr[start];
                                   start++;
                            }
                     }
              }
              return new int[] { -1, -1 };
       }
}
