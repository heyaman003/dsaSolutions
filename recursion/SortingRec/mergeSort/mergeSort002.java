package recursion.SortingRec.mergeSort;

import java.util.Arrays;

public class mergeSort002 {
        public static void main(String[] args) {
              int arr[]={5,4,3,2,1};
             mergeSortRec(arr,0,arr.length-1);
              System.out.println(Arrays.toString(arr));
       }
       static void mergeSortRec(int arr[],int start,int end){
              if(end-start==1)
              return ;
              int mid=start+(end-start)/2;
            mergeSortRec(arr, 0, mid);
            mergeSortRec(arr, mid+1, arr.length);
               mergeMe(arr,0,mid,arr.length-1);
       }
       private static int[] mergeMe(int arr[],int start,int mid,int end) {
             int mixarr[]=new int[end-start];
              int k=0;
             int l=start;
             int r=mid;
             while(l<mid&&r<end){
              if(arr[l]<arr[r]){
                 mixarr[k]=arr[l];
                    l++;
              }
              else{
                mixarr[k]=arr[r];
                     r++;    
              }
              k++;
             }
             while(l<mid){
              mixarr[k]=arr[l];
              l++;
              k++;
             }
             while(r<end){
           mixarr[k]=arr[r];
              r++;
              k++;
             }
              return arr;
       }
}
