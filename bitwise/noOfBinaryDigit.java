package bitwise;

public class noOfBinaryDigit {
       public static void main(String[] args) {
         int n=32;
        System.out.println(normalWay(32)); 
        System.out.println(logWay(n));   
       }
       static int normalWay(int n){
             int count=0;
              while (n>0) {
                n=n>>1;
                count++;      
              }
              return count;
       }
       static int logWay(int n){
              //for decimal use base 10;
              //for binary use base 2
            return(int)((Math.log(n)/Math.log(2)) +1);
       }
}
