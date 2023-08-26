

public class linearSearch {
       public static void main(String[] args) {
              int arr[]={12,45,67,10,89};
              System.out.println(linearSearch1(arr, 0, 1));
              System.out.println(normalApp(arr, 1));

       }
       static boolean linearSearch1(int arr[],int idx,int target){
              if(idx==arr.length)
              return false; 
              return (arr[idx]==target)?(arr[idx]==target):linearSearch1(arr, idx+1, target);
         
       }
       static int normalApp(int arr[],int target){
              for (int i = 0; i < arr.length; i++) {
                     if(arr[i]==target)
                     return 1;
              }
             return 0;
       }
}
