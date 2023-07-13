package binarySearch.leetcode;

import java.util.Scanner;

public class cellingStair {
    public static void main(String[] args) {
              int n;
              System.out.print("enetr the no of element :");
              Scanner sc = new Scanner(System.in);
              n = sc.nextInt();
              
              System.out.println(celling(n));
       }

       static int celling( int n) {
              int start = 0;
              int end = n;
              while (start<=end) {
                   long mid=start+(end-start)/2;
                    if(mid*(mid+1)/2==n)
                    return (int)mid;  
                    else if(mid*(mid+1)/2>n)
                    end=(int)mid-1;
                    else
                    start=(int)mid+1;
              }
             return end;
       }   
}
