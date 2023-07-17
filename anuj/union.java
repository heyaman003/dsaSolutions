package anuj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class union {
       public static void main(String[] args) {
              int arr1[]={1,1,2,3,8};
              int arr2[]={2,3,4,5};
              ArrayList<Integer> list=new ArrayList<>();
              for (int i: arr1) {
                     list.add(i);
              }
              for (int i: arr2) {
                     list.add(i);
              }
             
             
              List<Integer> unionList = new ArrayList<>();

        for (Integer element : list) {
            if (!unionList.contains(element)) {
                unionList.add(element);
            }
        }
        System.out.println(unionList);
        
        
       }
       
         
}
