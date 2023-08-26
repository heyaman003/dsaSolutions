package bitwise;

public class PowerOfAnyNo {
       public static void main(String[] args) {
              int n=3;
              int base=5;
             System.out.println(Optmize(n, base));
              System.out.println(test(10,20));
       }
       static int Optmize(int n,int base){
              int ans=1;
              while (n>0) {
                  if(((n&1)==1))
                   ans*=base;
                   base*=base;
                  n=n>>1;
              }
              return ans;
       }
       
       static int test(int n,int m){
              
              return (33&1);
       }
}
