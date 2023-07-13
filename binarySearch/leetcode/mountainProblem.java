package binarySearch.leetcode;

public class mountainProblem {
       public static void main(String[] args) {
              int arr[] = { -2,10, 65, 154, 232, 331,367 };
System.out.println(findElement(arr));

       }

      static int findElement(int arr[]){
          int start=0;
          int end=arr.length-1;
          while(start<=end){
              int mid=start+(end-start)/2;
              if(arr[mid+1]>arr[mid])
              start=mid+1;
              else if(arr[mid+1]<arr[mid])
              end=mid;
              if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]||mid==0)
              return arr[mid];
          }
       return -1;
      }

}
