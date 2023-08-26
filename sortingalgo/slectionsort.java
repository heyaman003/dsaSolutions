package sortingalgo;

import java.util.Arrays;

public class slectionsort {
       public static void main(String[] args) {
              int arr[]={10,34,23,45,89,30};
              bubbleSort(arr);
              System.out.println("Sorted array: " + Arrays.toString(arr));

       }
       static void slectionsortm(int arr[]){
              int max=arr[0];
              int id=0;
            for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr.length-i-1; j++) {
                   if(arr[j+1]>arr[j]){
                     max=arr[j+1];
                     id=j+1;
                   }
                   
                   else{
                      max=arr[j];
                      id=j;
                   }
              }
              int temp=arr[arr.length-i-1];
              arr[arr.length-i-1]=arr[id];
              arr[id]=temp;
            }
           
       }
       static void bubbleSort(int arr[]){
              
           
              int n = arr.length;
        
              for (int i = 0; i < n - 1; i++) {
                     for (int j = 0; j < n - i - 1; j++) {
                         if (arr[j] > arr[j + 1]) {
                             // Swap elements
                             int temp = arr[j+1];
                             arr[j+1] = arr[j];
                             arr[j] = temp;
                         }
                     }
                 }
             }
}
