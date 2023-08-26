package recursion.StringRelatedQus;

import java.util.ArrayList;
import java.util.List;

public class diceProblem {
       public static void main(String[] args) {
              int target=6;
              String s="";
              System.out.println(solvingDice(s, target,3));

       }
       static List<String> solvingDice(String s,int target,int k){
              if(target==0&&s.length()==3){
                     List<String> list=new ArrayList<>();
                     list.add(s);
                     return list;
              }
               List<String> list=new ArrayList<>();
              for(int i=1;i<=6 &&i<=target;i++){
                     list.addAll(solvingDice(s+i, target-i,3));
             }
             return list;
       }
}
