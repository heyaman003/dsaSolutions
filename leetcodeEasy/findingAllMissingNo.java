package leetcodeEasy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findingAllMissingNo {
       public static void main(String[] args) {
              int nums[]={1,4,5,3,4,8,6,4};
              System.out.println(findDisappearedNumbers(nums));
              System.out.println(findingEasy(nums));
       }
      static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer> list=new ArrayList<>();
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]&&nums[i]<=nums.length){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
            else i++;
        }
       for(int j=0; j < nums.length; j++) {
    if(nums[j] != j + 1) {
        list.add(j + 1);
    }
}
        return list;
}
static List<Integer> findingEasy(int nums[]){
       HashSet<Integer> aman=new HashSet<>();
    List<Integer> result =new ArrayList<>();
       for (int integer : nums) {
             aman.add(integer); 
       }
       for (int i = 0; i < nums.length; i++) {
              if( !aman.contains(i+1)){
                result.add(i+1);     
              }

       }
       return result;
}
}
