package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class perfectBinarySearch {
       public static void main(String[] args) {
              
              int n;
              System.out.print("enetr the no of element :");
              Scanner sc = new Scanner(System.in);
              n = sc.nextInt();
              int arr[] = new int[n];
              for (int i = 0; i < n; i++) {
                     arr[i] = sc.nextInt();
              }
              System.out.println(Arrays.toString(arr));
              System.out.println(binarySearchdiv(arr, 40,n));
       }

       static boolean binarySearchdiv(int arr[], int key,int n) {
              int startIndex = 0;
              int endIndex = arr.length - 1;
              if(arr[0]>arr[n-1]){
                while (startIndex <= endIndex) {
                     int middleIndex = startIndex + (endIndex - startIndex) / 2;
                     if (key == arr[middleIndex]) {
                            System.out.println("element found at "+(middleIndex+1)+"  positions");return true;
                            
                     } else if (key > arr[middleIndex]) {
                            endIndex=middleIndex-1;
                     }
                     else if(key<arr[middleIndex]){
                           startIndex=middleIndex+1;
                     }
              }  
              }
              else{
                   while (startIndex <= endIndex) {
                     int middleIndex = startIndex + (endIndex - startIndex) / 2;
                     if (key == arr[middleIndex]) {
                            System.out.println("element found at "+(middleIndex+1)+"  positions");return true;
                            
                     } else if (key > arr[middleIndex]) {
                           startIndex=middleIndex+1;
                     }
                     else if(key<arr[middleIndex]){
                     endIndex=middleIndex-1;
                     }
              }  
              }
              
              return false;
       }
}
