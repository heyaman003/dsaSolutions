package linearSearch;
import java.util.Scanner;
public class InArray{
     public static void main(String[] args) {
       System.out.print("enter the no of element : ");
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int[] Searcharr=new int[x];
       for (int i = 0; i <Searcharr.length; i++) {
              Searcharr[i]=sc.nextInt();
       }
            System.out.println(SearchingLinear(Searcharr,20));
            System.out.println("element found at "+ SearchingLinear2(Searcharr,20)+" position");
     }  


     public static boolean SearchingLinear( int arr[],int key){
         for (int i : arr) {
             if(i==key)
             return true; 
         }
       return false;
     }
     public static int SearchingLinear2( int arr[],int key){
         for (int i = 0; i < arr.length; i++) {
              if(arr[i]==key)
              return i+1;
         }
       return -1;
     }
}