package leetcodeEasy;

import java.util.*;

public class remoVeDuplicate {
       public static void main(String[] args) {
            int arr[]={1,1,2};
            System.out.println(removeDuplicates(arr));

       }
      static List<Integer> removeDuplicates(int[] nums) {
              int count=0;
              if(nums.length==1){
                List<Integer> list=new ArrayList<>();
                list.add(nums[0]);
                return list;     
              }
             List<Integer> list=new ArrayList<>();
              for(int i=0;i<nums.length-1;i++){
                  if(nums[i]!=nums[i+1])
                  {
                    list.add(nums[i]);
                  }
              }
              list.add(nums[nums.length-1]);
              return list;
          }
}
