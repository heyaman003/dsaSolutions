package sortingalgo;

import java.util.Arrays;

public class insertionSort {
       public static void main(String[] args) {
              int arr[]={10,1,2,5,7,20};
               insertIoncall(arr);
               System.out.println(Arrays.toString(arr));
       }

       private static void insertIoncall(int[] arr) {
              for (int i = 0; i < arr.length-1; i++) {
                  for (int j = i+1; j >0; j--) {
                     if(arr[j]>arr[j-1])
                     break;
                     else{
                            int temp=arr[j-1];
                            arr[j-1]=arr[j];
                            arr[j]=temp;
                     }
                  }   
              }
       }
}
