package recursion.SortingRec;

import java.util.Arrays;

public class bubbleRec {
       public static void main(String[] args) {
              int arr[]={10,6,4,2,19};
              System.out.println(Arrays.toString(recursiveBubbleSort(arr,arr.length-1, 0)));
       }
       static int[] recursiveBubbleSort(int arr[],int end,int start){
             if(end==0)
             return arr;
             if(start<end){
              if(arr[start]>arr[start+1])
              {
                     int temp=arr[start];
                     arr[start]=arr[start+1];
                     arr[start+1]=temp;

              }
              recursiveBubbleSort(arr, end, start+1);
              
             }
             else{
                recursiveBubbleSort(arr, end-1, 0);     
              }
              return arr;
       }
}
