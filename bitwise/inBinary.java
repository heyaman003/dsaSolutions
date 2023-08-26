package bitwise;

public class inBinary {
       public static void main(String[] args) {
              int n=100000000;
              System.out.println(countBinary(n));
              System.out.println(Integer.toBinaryString(n));

       }
       static int countBinary(int n){
              int count =0;
        while (n>0) {
              count++;
             n&=(n-1); 
        }
        return count;
       }
}
