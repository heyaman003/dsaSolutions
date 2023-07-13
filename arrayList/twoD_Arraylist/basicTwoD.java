package arrayList.twoD_Arraylist;

import java.util.ArrayList;

public class basicTwoD {
       public static void main(String[] args) {
              ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
              ArrayList<Integer> list1=new ArrayList<>();
              ArrayList<Integer> list2=new ArrayList<>();
              ArrayList<Integer> list3=new ArrayList<>();
              ArrayList<Integer> list4=new ArrayList<>();
              list1.add(30);
              list1.add(40);
              list1.add(50);
              list1.add(60);
              list2.add(70);
              list2.add(80);
              list2.add(90);
              list2.add(100);
              list3.add(7);
              list3.add(8);
              list3.add(9);
              list3.add(10);
              list4.add(-1);
              list4.add(-8);
              list4.add(-9);
              list4.add(-10);
              mainList.add( list1);
              mainList.add( list2);
              mainList.add( list3);
              mainList.add( list4);
              System.out.println(mainList);
       }
}
