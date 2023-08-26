package binarySearch.leetcode;

public class noOfdigists {
       public static void main(String[] args) {
              int n=10;
              System.out.println(Integer.toBinaryString(n));
              int digit=(int)(Math.log(n)/Math.log(2))+1;
              System.out.println(digit);
       }
}
