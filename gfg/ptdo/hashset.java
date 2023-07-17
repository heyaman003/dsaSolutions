package gfg.ptdo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class hashset {
       public static void main(String[] args) {
              String A="aabc";
              HashMap<Integer,Character> myMap=new HashMap<>();
        Set<Character> helloset=new HashSet<>();
        StringBuilder s=new StringBuilder();
               System.out.println(laudalaheshun(A));

        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
           myMap.put(i,ch);
          helloset.add(ch);
        }
       for(Integer i:myMap.keySet()){
              boolean f=false;
           if(!helloset.contains(myMap.get(i))){
               s.append("#");
           }
           else{
              s.append(myMap.get(i));
              helloset.remove(myMap.get(i));
           }
           
       } 
       System.out.println(s);
       }
       static String laudalaheshun(String s1){
        char[]c1=s1.toCharArray();
        for (int i = 0; i < c1.length; i++) {
              for (int j = i+1; j < c1.length; j++) {
                     if(c1[i]==c1[j])
                     {
                        c1[j]='#';    
                     }
                     
              }
        }


       
              return new String(c1);
       }
}

    