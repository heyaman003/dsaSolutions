package bitwise;

public class Find_nthMagicalNo {
       public static void main(String[] args) {
              int n=6;
              System.out.println(magicNo(4));
              System.out.println(anotherMethod(4));

       }
       static int magicNo(int n){
              //we have n=6 binary representation=110;
              int magicno=0;
              int pow=0;
              while (n>0) {
                     pow++;
                    if(n%2!=0)
                    magicno= (int) Math.pow(5, pow)+magicno;
                    n=n/2;    
              }
             return magicno;
       }
       static int anotherMethod(int n){
              int magicNo=0;
              int pow=0;
              while (n>0) {
                      pow++;
                   int lastdigit=n&1;
                  magicNo=magicNo+(int)(lastdigit*(Math.pow(5, pow)));
                  n=n>>1;
              }
              return magicNo;
       }
}
