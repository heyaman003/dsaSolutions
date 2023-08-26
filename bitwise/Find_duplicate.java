package bitwise;

import java.util.ArrayList;
import java.util.List;

public class Find_duplicate {
       public static void main(String[] args) {
              int arr[]={10,11,23,45,56,10,45,11,56};
              System.out.println(findUnique(arr));
              System.out.println(duplicateList(arr));
       }
       static int findUnique(int arr[]){
              int unique=0;
                for (int i : arr) {
                     unique^=i;
                }
                return unique;
       }
       static List<Integer> duplicateList(int arr[]) {
              List<Integer> list = new ArrayList<>();
              for (int i = 0; i < arr.length; i++) {
                  for (int j = i + 1; j < arr.length; j++) {
                      if ((arr[i]^arr[j]) == 0) {
                          list.add(arr[i]);
                          break; // Once we find a duplicate, no need to check further for this element.
                      }
                  }
              }
              return list;
          }
          
}
