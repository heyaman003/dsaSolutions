package recursion.StringRelatedQus;

public class dailPad {
       public static void main(String[] args) {
              String s="123";
              String ans="";
           myMethod(ans,s);
             
       }
       static void myMethod(String p,String up){
              if(up.isEmpty()){
                     System.out.println(p);
                     return;
              }
              int digit=up.charAt(0)-'0';
              for (int i = (digit-1)*3; i < (digit)*3; i++) {
                     char ch=(char)('a'+i);
                   myMethod(p+ch, up.substring(1));  
              }
       }
}
