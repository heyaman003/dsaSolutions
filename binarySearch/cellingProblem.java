package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class cellingProblem {
       
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
              System.out.print("now enetr key for the sol : ");
              int key =sc.nextInt();
              System.out.println("the ans is " +binarySearchdiv(arr,key,n));
       }

       static int binarySearchdiv(int arr[], int key,int n) {
              int startIndex = 0;
              int endIndex = arr.length - 1;
              if(arr[0]>arr[n-1]){
                while (startIndex <= endIndex) {
                     int middleIndex = startIndex + (endIndex - startIndex) / 2;
                     if (key == arr[middleIndex]) {
                            return arr[middleIndex];
                     } else if (key > arr[middleIndex]) {
                            endIndex=middleIndex-1;
                     }
                     else if(key<arr[middleIndex]){
                           startIndex=middleIndex+1;
                     }
              }  
              return arr[endIndex];
              }
              else{
                   while (startIndex <= endIndex) {
                     int middleIndex = startIndex + (endIndex - startIndex) / 2;
                     if (key == arr[middleIndex]) {
                            return arr[middleIndex];
                            
                     } else if (key > arr[middleIndex]) {
                           startIndex=middleIndex+1;
                     }
                     else if(key<arr[middleIndex]){
                     endIndex=middleIndex-1;
                     }
              } 
              return arr[startIndex]; 

              }
              
              
       }
             
       }

