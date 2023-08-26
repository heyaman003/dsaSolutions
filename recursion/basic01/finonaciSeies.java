package recursion.basic01;

public class finonaciSeies {
       public static void main(String[] args) {
               int n=8;
               System.out.println(fibbo(n));
               System.out.println(recursiveFibbo(n));
       }
      static int fibbo(int n){
       if(n==0||n==1)
       if(n==0)
       return 0;
       else return 1;
       int fristPrev=0;
       int lastPrev=1;
       int nthfibboIs=0;
         int i=2;
         while(i<=n){
            nthfibboIs=fristPrev+lastPrev;
            fristPrev=lastPrev;
            lastPrev=nthfibboIs;
            i++;
         }
         return nthfibboIs;
      }
      static int recursiveFibbo(int n){
          if(n==0||n==1){
              if(n==0)
              return 0;
          else return 1;
          }
          else return recursiveFibbo(n-1)+recursiveFibbo(n-2);
      }
}
