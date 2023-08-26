public class palindromeCheeker {
       public static void main(String[] args) {
              int n=313;
              System.out.println(brutForce(n));
              System.out.println(recursiveApproach(n)==1);
       }
       static boolean brutForce(int n){
              int x=n;
              int rev=0;
              while(n>0){
                 rev=rev*10+(n%10);
                 n/=10;
              }
              return (x==rev);
       }
       static int rev=0;
       static int recursiveApproach(int n){
              int x=n;
              if(n==0)
              return 0;
              rev= rev*10+(n%10);
             recursiveApproach(n/10);
            return (rev==x)?1:0;

       }
}
