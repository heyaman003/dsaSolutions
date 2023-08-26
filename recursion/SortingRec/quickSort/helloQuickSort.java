package recursion.SortingRec.quickSort;

import java.util.Arrays;

public class helloQuickSort {
       public static void main(String[] args) {
              int arr[]={10,8,18,27,10};
              recursiveApproach(arr, 0, arr.length-1);
              System.out.println(Arrays.toString(arr));
       }
       static void recursiveApproach(int arr[],int start,int end){
              if(start>end)
              return ;
              int l=start;
              int h=end;
              int mid=l+(h-l)/2;
              while(l<=h){
                 while(arr[l]<arr[mid]){
                     l++;
                 }
                 while(arr[h]>arr[mid]){
                     h--;
                 }
                if(l<=h)
                {
                     int temp=arr[l];
                     arr[l]=arr[h];
                     arr[h]=temp;
                     h--;
                     l++;
                }

              }
              //now sorting lhs and rhs;
              recursiveApproach(arr,start, h);
              recursiveApproach(arr,l, end);
       }
}
