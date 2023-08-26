package mathForDsa.primeFactor;

import java.util.ArrayList;
import java.util.List;

public class basic {
       public static void main(String[] args) {
              int n=20;
              System.out.println(brutForce(n));
              System.out.println(sqrtTimeComp(n));
       }
      static List<Integer> brutForce(int n){
      List<Integer>list =new ArrayList<>();
       for (int i = 1; i <=n; i++) {
              if(n%i==0)
              list.add(i);
       }
       return list;
      }
      static List<Integer> sqrtTimeComp(int n){
      List<Integer>list =new ArrayList<>();
       for (int i = 1; i*i<=n; i++) {
              if(n%i==0){
              if((n/i)==i){
                 list.add(i);     
              }
              else{
                   list.add(i);
                 list.add(n/i);   
              }
               
              }
              
       }
       return list;
      }
}
