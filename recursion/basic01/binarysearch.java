package recursion.basic01;

public class binarysearch {
       public static void main(String[] args) {
              int arr[]={10,23,45,54,56};
              int target =54;
              System.out.println(binarySearchNormal(arr, target));
              System.out.println(binarysearchUsingRecurision(arr, target,0,arr.length));

       }
       static int binarySearchNormal(int arr[],int target){
         int start=0;
         int end=arr.length-1;
         while(start<=end){
              int mid=start+(end-start)/2;
              if(arr[mid]==target)
              return mid;
              else if(arr[mid]>target)
              end=mid-1;
              else start=mid+1;
         }
         return -1;
       }
       static int binarysearchUsingRecurision(int arr[],int target,int start,int end){
             int mid=start+(end-start)/2;
             if(arr[mid]==target)
             return mid;
             if(arr[mid]>target){
              end=mid-1;
              return binarysearchUsingRecurision(arr, target,start,end);
             }
             else return binarysearchUsingRecurision(arr, target,mid+1,end);   
       }
}
