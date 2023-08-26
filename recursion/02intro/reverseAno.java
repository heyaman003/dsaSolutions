public class reverseAno {
       public static void main(String[] args) {
              int n=1089;
              System.out.println(brutForceRev(n));
              System.out.println(recursiveApproach(n));
       }
       static int brutForceRev(int n){
              int rev=0;
              while(n>0){
                     rev=rev*10+n%10;
                     n/=10;
              }
              return rev;
       }
       static int sum=0;
       static int recursiveApproach(int n) {
         
              if (n == 0) {
                  return 0;
              }
              if (n < 0) {
                  return -recursiveApproach(-n);
              }
              sum=sum*10+(n%10);
              recursiveApproach(n / 10);
              return sum;
          }
}
