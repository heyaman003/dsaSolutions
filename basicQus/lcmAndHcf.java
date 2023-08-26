package basicQus;

public class lcmAndHcf {
       public static void main(String[] args) {
              int n1=13;
              int n2=1;
              System.out.println(gcd(n1, n2));
              System.out.println(lcm(n1, n2));
              System.out.println(lcm1(n1, n2,gcd(n1, n2)));
              System.out.println((12%1==0 ));
       }
       static int gcd(int n1,int n2){
            while(n1>0){
              int temp=n1;
              n1=n2%n1;
              n2=temp;
            }
            return n2;
       }
       static int lcm(int n1,int n2){
              int max=Math.max(n1,n2);
             int lcm=max;
              while(true){
                     if(lcm%n1==0&&lcm%n2==0)
                     break;
                     else lcm+=n2;
              }
              return lcm;
       }
       static int lcm1(int n1,int n2,int gcd){
            
         return n1*n2/gcd;
       }
}
