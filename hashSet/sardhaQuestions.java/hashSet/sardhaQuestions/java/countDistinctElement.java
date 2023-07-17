import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class countDistinctElement {
      public static void main(String[] args) {
       int arr[]={1,2,1,1,3,4,3,2,1};
       HashSet<Integer> Count=new HashSet<>();
       for (int i : arr) {
            Count.add(i);
       }
       
       System.out.println(Count);
       System.out.println(bruteforce(arr));
       System.out.println(wrostCase(arr));
        StringBuilder s1=new StringBuilder();
      
        
} 



      public static List<Integer> bruteforce(int arr[]) {
       List<Integer> resultList = new ArrayList<>();
       for (int i : arr) {
          if(!resultList.contains(i))
          resultList.add(i);    
       }
      System.out.println(Arrays.toString(arr));
       return resultList;
      
   }




   public static String wrostCase(int arr[]){
   int[] arrDistinc=new int[10];
   int m=0;
   for (int i=0;i<arr.length;i++) {
       int j;
       for (j = 0; j < i; j++) {
            if(arr[i]==arrDistinc[j])
            break;    
       }
       if(i==j){
       arrDistinc[m]=arr[j]; 
        m++;  
       }
      
   }
   return Arrays.toString(Arrays.copyOf(arrDistinc, m));
   }
}
