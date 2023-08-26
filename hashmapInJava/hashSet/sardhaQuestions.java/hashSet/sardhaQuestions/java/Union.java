import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



public class Union {
       public static void main(String[] args) {
            int arr1[]={1,1,2,4,2,5};  
            int arr2[]={1,7,3,2,5}; 
            int len=arr1.length+arr2.length;
            int mergeArr[]=new int[len];
            int x=0;
            for (int i : arr2) {
              mergeArr[x]=i;
              x++;
            } 
            for (int i : arr1) {
              mergeArr[x]=i;
              x++;
            } 
            System.out.println(wrostCase(mergeArr));
            System.out.println(optimal(mergeArr));
            System.out.println(optimal2(mergeArr));
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
              static List<Integer> optimal(int arr[]){
                     List<Integer> unionList = new ArrayList<>();

                     for (int i:arr) {
                         if (!unionList.contains(i)) {
                             unionList.add(i);
                         }
                     }
                     return unionList;
              }
              static Set<Integer> optimal2(int array[]) {
                     Set<Integer> union = new LinkedHashSet<>();
                     
                     for (int i : array) {
                         union.add(i);
                     }
                     
                     return union;
                 }
}
