package bitwise.leetcode;

import java.util.Arrays;

public class arrayOfsetBits {
       public static void main(String[] args) {
              int num=10;
              System.out.println(Integer.toBinaryString(num));
           System.out.println(Arrays.toString(countBits(num)));   
       }
       static int[] countBits(int n) {
              int[] res = new int[n + 1]; 
              for (int i = 1; i <= n; i++) { 
                  int count = 0;
                  int nums=i;
                  while (nums> 0) {
                   nums &= (nums- 1);
                      count++;
                  }
                  res[i] = count;
              }
              return res;
          }
}
