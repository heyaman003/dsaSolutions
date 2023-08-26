package rotation;

public class findSmallest {
       public static void main(String[] args) {
              int arr[]={5, 4, 2, 3, 4,4,4};
              System.out.println(piviotIs(arr));
       }
       static int piviotIs(int arr[]){
              int start=0;
              int end=arr.length-1;
              while(start<end){
                     int mid=start+(end-start)/2;
                    if(arr[mid]>arr[end]){
                           start=mid+1;
                    }
                    else if(arr[mid]<arr[end]){
                     end=mid;
                    }
                    else{
                     end--;
                    }
              }
              return arr[start];
       }
}
