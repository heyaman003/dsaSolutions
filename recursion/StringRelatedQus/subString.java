package recursion.StringRelatedQus;

import java.util.ArrayList;


public class subString {
    public static void main(String[] args) {
       String str1="abc";
       String str2="";
       permutationRecursion(str1, str2);
      System.out.println(permutationRecursion2(str1, str2));
      System.out.println(permutationRecursion3(str1, str2));
      System.out.println('c'-0);
    }
    static void permutationRecursion(String s,String n){
       if(s.isEmpty()){
              System.out.println(n);
              return;
       }
  
       char ch=s.charAt(0);
        for (int i = 0; i <=n.length(); i++) {
            String left=n.substring(0, i);  
            String rigth=n.substring(i, n.length()); 
            permutationRecursion(s.substring(1), left+ch+rigth); 
        }
    }
    static ArrayList<String> permutationRecursion2(String s,String n){
       if(s.isEmpty()){
              ArrayList<String> list=new ArrayList<>();
              list.add(n);
              return list;
       }
       char ch=s.charAt(0);
       ArrayList<String>list=new ArrayList<>();
        for (int i = 0; i <=n.length(); i++) {
            String left=n.substring(0, i);  
            String rigth=n.substring(i, n.length()); 
            list.addAll(permutationRecursion2(s.substring(1), left+ch+rigth)); 
        }
       return list;
    }
    
    static int permutationRecursion3(String s,String n){
       int count=0;
       if(s.isEmpty()){
           return 1;
       }
  
       char ch=s.charAt(0);
        for (int i = 0; i <=n.length(); i++) {
            String left=n.substring(0, i);  
            String rigth=n.substring(i, n.length()); 
            count =count+permutationRecursion3(s.substring(1), left+ch+rigth); 
        }
        return count;
    }
}
