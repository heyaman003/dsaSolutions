public class productOfNo {
       public static void main(String[] args) {
              int n=-118;
              System.out.println(brutForce(n));
              System.out.println(recursiveWay(n));
       }
       static int brutForce(int n){
              int product =1;
              if(n<0){
                 product=-1; 
                 n=-n;    
              }
             

              while(n>0){
                     product*=n%10;
                     n/=10;
              }
              return product;
       }
       static int recursiveWay(int n){
              if(n==0)
              return 1;
              return (n%10)*recursiveWay(n/10);
       }
}
