package Accenture;

public class smallestNoSearch {
       public static void main(String[] args) {
            int arr[]={0,10,4,6,8,1,7,0};  
            System.out.println(search_in_N(arr));
       }
       static int search_in_N(int arr[]){
          int start=0;
          int end=arr.length-1;
          while(start<end){
              if(arr[start]<arr[end])
              end--;
              else start++;
             
          }
          return arr[start];
       }
}
