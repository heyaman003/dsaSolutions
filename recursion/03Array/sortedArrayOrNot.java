
public class sortedArrayOrNot {
      public static void main(String[] args) {
       int arr[]={1,2,3,4,74};
       System.out.println((isSorted(arr)==1));
       System.out.println(resSurciveWay(arr, 0));
      } 
      static int isSorted(int arr[]){
       int x=1;
      for (int i = 0; i < arr.length-1; i++) {
       if(arr[i]>arr[i+1])
       return 0;
      }
       return 1;
      }
      static boolean resSurciveWay(int arr[],int index){
           if(index==arr.length-1)
           return true;
           return (arr[index]<arr[index+1])&&resSurciveWay(arr, index+1);
      }
}
