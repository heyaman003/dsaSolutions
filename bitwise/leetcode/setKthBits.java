package bitwise.leetcode;

public class setKthBits {
       public static void main(String[] args) {
              int n=10;
              System.out.println(Integer.toBinaryString(n));
              System.out.println(setBits(n, 2));
             
       }
       static int setBits(int n,int k){
             
              return ((1 << k) | n);
       }
       
}
