package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class findDuplicate {
       public static void main(String[] args) {
              int arr[]={10,3,2,10,7,3,7};
              System.out.println(brutforce(arr));
       }
       static List<Integer> brutforce(int arr[]){
              List<Integer> list=new ArrayList<>();
              for(int i=0;i<arr.length;i++){
                     boolean flag=false;
               for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                     flag=true;
                     continue;
              }
               }
               if(flag &&!list.contains(arr[i])){
                  list.add(arr[i]);   
               }
              }
              return list;
       }
}
