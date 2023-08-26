package leetcodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class astroid {
       public static void main(String[] args) {
              List<Integer> list=new ArrayList<>();
             int arr[]={10,-15,5,20};
             list.add(arr[0]);
             for(int i=0;i<arr.length;i++){
                 if(arr[i]<0){
                   while(arr[i-1]>0&&arr[i-1]>Math.abs(arr[i]))
                   {continue;}
                   if(arr[i-1]>0&&arr[i-1]<Math.abs(arr[i])){
                     list.remove(i);
                   list.add(arr[i]);
                   }
                 }
                 list.add(arr[i]);
             } 
             System.out.println(Arrays.toString(arr));
       }

}
