package bitwise;

public class totalNoofsetBits {
       public static void main(String[] args) {
              int n=121;
              System.out.println(countSetbits(n));
       }
       static int countSetbits(int i){
              int countbits=0;
              while(i>0){
                   if((i&1)==1)
                   countbits++;
                   i=i>>1;
              }
              return countbits;
       }
      static int cheeckisorNot(int n){
            for (int i = 0; i < n; i++) {
              if(i+countSetbits(i)==n)
              return 0;
            }
            return 1;
       }
}
