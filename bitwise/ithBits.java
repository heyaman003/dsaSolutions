package bitwise;

public class ithBits {
       public static void main(String[] args) {
              int n=10;
              System.out.println(brutforece(n));
       }
       static int brutforece(int  n){
           String str="";
              int rev=0;
              while (n>0) {
               str=String.valueOf(n%2)+str;
               n=n/2;      
              }
              return Integer.parseInt(str);
       }
}
