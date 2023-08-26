package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class listArray {
class Solution {
       public static void main(String[] args) {
         int arr[]={9,9,9,9,9,9,9,9,9,9};
         int k=1;   
         System.out.println(addToArrayForm(arr, k));
       }
    static List<Integer> addToArrayForm(int[] num, int k) {
      int nums=0;
      List<Integer> list=new ArrayList<>();
      for(int i:num){
          nums=nums*10+i;
      }  
      nums+=k;
      if(nums==0)
      list.add(0);
     while(nums>0){
         list.add(0,nums%10);
         nums/=10;
     }
     return list;
    }
}
}
