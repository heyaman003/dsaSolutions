package rough;

import leetcodeEasy.remoVeDuplicate;

public class binarySearch {
       public static void main(String[] args) {
              int arr[]={10,12,45,67,89};
              System.out.println(normalWay(arr, 0, arr.length-1,67));
              System.out.println(binarySearchRecursive(arr, 0, arr.length-1,67));
              System.out.println(binarySearchRecursive2(arr, 0, arr.length-1,68));
       }
       static boolean normalWay(int arr[],int start,int end,int target){
                while(start<=end){
                     int mid=start+(end-start)/2;
                     if(arr[mid]==target)
                     return true;
                     if(arr[mid]<target)
                     start=mid+1;
                     else end=mid-1;
                }
                return false;
              
       }
       static boolean binarySearchRecursive(int arr[],int start,int end,int target){
              if(start>=end)
              return false;
              int mid=start+(end-start)/2;
              if(arr[mid]==target)
              return true;
              if(arr[mid]>target)
             return binarySearchRecursive(arr, start, mid-1, target);
            else  
           return binarySearchRecursive(arr, mid+1, end, target);
           
             
       }
       static boolean binarySearchRecursive2(int arr[],int start,int end,int target){
            
             if(start<=end){
                   int mid=start+(end-start)/2;
                   if(arr[mid]==target)
                   return true;
                   if(arr[mid]>target)
                   return binarySearchRecursive2(arr, start, mid-1, target);
                   else return binarySearchRecursive2(arr, mid+1, end, target);
             }
             else return false;
             
       }
}
