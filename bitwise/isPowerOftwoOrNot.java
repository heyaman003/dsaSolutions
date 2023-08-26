package bitwise;

public class isPowerOftwoOrNot {
       public static void main(String[] args) {
              System.out.println(Brutforece(6));
              System.out.println(OptmizeApp(8));
              StringBuilder str=new StringBuilder();
             
       }
       static boolean Brutforece(int n){
              int count=0;
          while (n>0) {
              if(n%2==1)
              count++;
              n= n>>1;
              if(count>1)
              return false;
         
          }
          return true;
       }
       static boolean OptmizeApp(int n){
         return((n&(n-1))==0);
       }
}
