package rough;

public class linearSearch {
       public static void main(String[] args) {
              int arr[]={10,8,45,32,10};
              System.out.println(recursiveWay(arr,0,32));
       }

       private static boolean recursiveWay(int arr[],int id,int target) {
             if(arr[id]==target)
             return true;
             if(id==arr.length-1)
             return false;
             return recursiveWay(arr, id+1, target);
             
       }
}
