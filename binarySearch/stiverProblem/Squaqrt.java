package binarySearch.stiverProblem;

public class Squaqrt {
       public static void main(String[] args) {
              int n=10;
              System.out.println(LinearlysqurtFunc(2147483647));
       }
      static int LinearlysqurtFunc(int n){
       int i=1;
       if(n==0)
       return 0;
           while (i<=n/2) {
              if(i*i==n){
                return i;    
              }
             if(i*i>n)
             return (i-1); 
             i++; 
           }
           return i-1;
      }
}
