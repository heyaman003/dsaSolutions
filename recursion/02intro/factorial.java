
public class factorial {
    public static void main(String[] args) {
       int n=25;
      // System.out.println(brutForce(n));
       System.out.println(recurciveFact(n));
    } 
    static int brutForce(int n){
       int fact=1;
       if(n==0)
       return 1;
       for (int i = 1; i <=n; i++) {
             fact*=i; 
       }
       return fact;
    }  
    static int recurciveFact(int n){
            if(n==0||n==1)
            return 1;
            return n*recurciveFact(n-1);
    }
}
