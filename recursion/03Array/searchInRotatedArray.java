
public class searchInRotatedArray {
     public static void main(String[] args) {
       int arr[]={10,12,14,15,1,2,3,4,5};
     }  
     static int countRotation(int arr[],int s,int e,int target){
       int mid=s+(e-s)/2;
       if(s>e)
       return -1;
      if(arr[mid]==target)
      return mid;
      
       return 1;
     }
}
