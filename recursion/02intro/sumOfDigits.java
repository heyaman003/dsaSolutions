

public class sumOfDigits {
  public static void main(String[] args) {
       int n=1034;
       System.out.println(brutForce(n));
       System.out.println(RecursiveSum(n));
} 

  static int brutForce(int n){
       int sum=0;
       while(n>0){
           sum+=n%10;
           n/=10;
       }
       return sum;
  } 
  static int RecursiveSum(int n){
       if(n==0)
       return 0;
       return (n%10)+RecursiveSum(n/10);
  }   
}
