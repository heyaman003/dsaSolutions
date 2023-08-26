import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersection {
       public static void main(String[] args) {
              int arr1[]={1,2,1,3,4,5,7};
              int arr2[]={3,4,5,3,8,9,1};
              System.out.println(intersectionfunc(arr1, arr2));
              System.out.println(insertionFunc2(arr1, arr2));
       }
       static List<Integer> intersectionfunc(int arr1[],int arr2[]){
              List<Integer> copyArray1=new ArrayList<>();
              List<Integer> intersectionArray=new ArrayList<>();
              for (int i : arr1) {
                     copyArray1.add(i);     
              }
              for ( int i :arr2) {
                   if(copyArray1.contains(i)){
                     intersectionArray.add(i);
                     copyArray1.remove(Integer.valueOf(i));
                   }
                   
              }
              return intersectionArray;
       }
       static Set<Integer> insertionFunc2(int arr1[],int arr2[]){
              Set<Integer> copy = new HashSet<>();
              Set<Integer> intersection = new HashSet<>();
              for (int i: arr1) {
                   copy.add(i);  
              }
              for (int i: arr2) {
                   if(copy.contains(i)){
                     copy.remove(i);
                     intersection.add(i);
                   }  
              }
              return intersection;


       }
}
