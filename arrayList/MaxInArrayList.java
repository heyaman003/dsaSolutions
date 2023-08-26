package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxInArrayList {
       public static void main(String[] args) {
              ArrayList<Integer> List = new ArrayList<>(10);
              Scanner sc = new Scanner(System.in);
              System.out.print("enetr the no of element for array list : ");
              int n = sc.nextInt();
              for (int i = 0; i < n; i++) {
                     List.add(sc.nextInt());
              }
              System.out.println(List);
              System.out.print("the samallest no is : " +returnMin(List));
              System.out.println();
              System.out.print("the greatest no is : " +returnMax(List));
              List.add(5,10);
       }

       static int returnMax(ArrayList<Integer> list) {
              int max=Integer.MIN_VALUE;
              for (Integer integer : list) {
                    if(max<integer)
                    max=integer;
              }
              return max;
       }
      
       static int returnMin(ArrayList<Integer> list) {
              int min=Integer.MAX_VALUE;
              for (Integer integer : list) {
                    if(min>integer)
                   min=integer;
              }
              return min;
       }
       

}
