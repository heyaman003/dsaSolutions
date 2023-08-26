package bitwise;

public class decimaltoBinaryConc {
       public static void main(String[] args) {
              int n=8;
              int binary=0;
              int c=0;
              while (n > 0) {
                  if((n&1)==0)
                  binary*=10;
                  else
                  binary=binary*10+1;
                  n=n>>1;
                 }
               System.out.println(binary);
       }
}
