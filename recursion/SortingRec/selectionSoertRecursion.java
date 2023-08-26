package recursion.SortingRec;

import java.util.Arrays;

public class selectionSoertRecursion {
       public static void main(String[] args) {
              int arr[]={10,5,7,3,19,18};
              System.out.println(Arrays.toString(recursiveAppSelectionSort(arr, 0,arr.length-1, 0)));
              
       }
       static int[] recursiveAppSelectionSort(int arr[], int start, int end, int max) {
              if (end == 0)
                  return arr;
      
              if (start < end) {
                  if (arr[start] > arr[max]) {
                      max = start;
                  }
                  recursiveAppSelectionSort(arr, start + 1, end, max);
              } else {
                  int temp = arr[end];
                  arr[end] = arr[max];
                  arr[max] = temp;
              }
              
              // Recursively sort the rest of the array
              recursiveAppSelectionSort(arr, 0, end - 1, 0);
              
              return arr;
          }
}
