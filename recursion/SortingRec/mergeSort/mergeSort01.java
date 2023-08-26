package recursion.SortingRec.mergeSort;

import java.util.Arrays;

public class mergeSort01 {
       public static void main(String[] args) {
              int arr[]={5,4,3,2,1};
              System.out.println(Arrays.toString(mergeSortRec(arr)));
       }
       static int[] mergeSortRec(int arr[]){
              if(arr.length==1)
              return arr;
              int mid=arr.length/2;
             int leftarr[]=mergeSortRec(Arrays.copyOfRange(arr, 0, mid));
             int rightarr[]=mergeSortRec(Arrays.copyOfRange(arr, mid, arr.length));
             return mergeMe(leftarr,rightarr);
       }
       private static int[] mergeMe(int left[], int right[]) {
             int mergearr[]=new int[left.length+right.length];
             int k=0;
             int l=0;
             int r=0;
             while(l<left.length&&r<right.length){
              if(left[l]<right[r]){
                    mergearr[k]=left[l];
                    l++;
              }
              else{
                     mergearr[k]=right[r];
                     r++;    
              }
              k++;
             }
             while(l<left.length){
              mergearr[k]=left[l];
              l++;
              k++;
             }
             while(r<right.length){
              mergearr[k]=right[r];
              r++;
              k++;
             }
              return mergearr;
       }
}
