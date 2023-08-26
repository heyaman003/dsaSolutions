import java.util.ArrayList;
import java.util.List;

public class countZero {
       public static void main(String[] args) {
              int n=101010;
              System.out.println(normalWay(n));
              System.out.println(recursiveWay(n));
              List<Integer>list=new ArrayList<>();
              

       }
       static int normalWay(int n){
              int count=0;
              while(n>0){
                     if(n%10==0)
                     count ++;
                     n/=10;
              }
              return count;
       }
       static int recursiveWay(int n){
              int count =0;
              return helper(n, count);
       }
       private static int helper(int n,int count){
              if(n==0)
              return count;
              return (n%10==0)?helper(n/10, count+1):helper(n/10, count);
       }
}
