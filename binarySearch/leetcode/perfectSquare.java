package binarySearch.leetcode;

/* Given a positive integer num, return true if num is a perfect 
square or false otherwise.

A perfect square is an integer that is the square of an integer.
 In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.
 */
public class perfectSquare {
 public static void main(String[] args) {
              /* int n;
              System.out.print("enetr the no of element :");
              Scaner sc = new Scaner(System.in);
              n = sc.nextInt();
              int numbers[] = new int[n];
              for (int i = 0; i < n; i++) {
                     numbers[i] = sc.nextInt();
              } */
              System.out.println(perfectSquareOpt(20));
              System.out.println(perfectSquareOpt1(26));
       }

       static boolean perfectSquareOpt(int n) {
              int low = 0;
              int high = n;
              while (low<high) {
                     int mid = low + (high - low) / 2;
                     if (mid*mid==n) {
                             return true;
                            
                     } else if (mid*mid>n) {
                             
                             high=mid-1;
                     }
                     else if(mid*mid<n){
                            low=mid+1;
                     }
              }
              return false; 
       }
       static int perfectSquareOpt1(int n) {
              int low = 0;
              int high = n;
              while (low<high) {
                     int mid = low + (high - low) / 2;
                     if (mid*mid==n) {
                             return mid;
                            
                     } else if (mid*mid>n) {
                             
                             high=mid-1;
                     }
                     else if(mid*mid<n){
                            low=mid+1;
                     }
              }
              return high; 
       }
}
