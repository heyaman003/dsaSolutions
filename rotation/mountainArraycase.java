package rotation;

public class mountainArraycase {
       public static void main(String[] args) {
              int arr[]={10,34,56,67,67,89,89,34,32,1,0};
              System.out.println(PeakIndex(arr));
              
       }
       static int PeakIndex(int arr[]){
              int start=0;
              int end=arr.length-1;
              while(start<end){
                     int mid=start+(end-start)/2;
                     if(arr[mid]>=arr[mid+1])
                     end=mid;
                     else start=mid+1;
              }
              return start;
       }
}
