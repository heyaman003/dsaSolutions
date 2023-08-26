package bitwise;

public class practice {
       public static void main(String[] args) {
            int n=100001101;
            System.out.println(findIthbitsOfnumber(n, 4));
       }
       static int findIthbitsOfnumber(int n,int k){
              int m=n&(1<<(k-1));
           return (m!=0)? 1: 0;
       }
}
