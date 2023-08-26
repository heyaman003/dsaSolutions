
public class sumPfnThNo {
       public static void main(String[] args) {
              System.out.println(BrutForce(3));
              System.out.println(RecursiveSum(10));
              System.out.println(basic(10));
              
       }
       static int BrutForce(int n){
              return (n*(n+1))/2;
       }
       static int RecursiveSum(int n) {
              if (n <= 1)
                  return 1;
          
              return n + RecursiveSum(n - 1);
          }
          static int basic(int n){
              int sum=0;
              while (n>0) {
                sum+=n;
                n=n-1;     
              }
              return sum;
          }
}
