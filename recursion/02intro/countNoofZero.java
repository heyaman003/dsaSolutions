public class countNoofZero {
       public static void main(String[] args) {
              int n=1000020;
              System.out.println(normalapp(n));
              System.out.println(usingRecursion(n));

       }
       static int normalapp(int n){
              int count=0;
              while(n>0){
                 if(n%10==0) count++;
                 n/=10;
              }
              return count;
       }
       static int count=0;
       static int usingRecursion(int n){
             if(n==0)
             return 0;
             if(n%10==0)
              count++;
          return count +usingRecursion(n/10);
             

       }
}
