package rough;

public class factorial {
       public static void main(String[] args) {
             System.out.println(normalway(5)); 
             System.out.println(recursiveWay(5));
          
       }
       private static int recursiveWay(int n) {
              if(n==1){
                     return 1;
              }
              if(n<=0){
                     return 0;
              }
              return n*(recursiveWay(n-1));
       }
       static int normalway(int n){
              int fact=1;
              for(int i=1;i<=n;i++){
                 fact*=i;
              }
              return fact;
       }
}
