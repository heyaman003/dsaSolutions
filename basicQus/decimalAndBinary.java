package basicQus;

public class decimalAndBinary {
       public static void main(String[] args) {
              int n=42;
              System.out.println(Binary(n));
              System.out.println(BinaryWithoutRecursion(n));
              System.out.println(decimalFind(BinaryWithoutRecursion(n)));
       }
       static String Binary(int n) {
              StringBuilder str = new StringBuilder();
              if (n == 0) {
                  return "0";
              }
              str.append(Binary(n / 2));
              str.append(n % 2);
              return str.toString();
          }
       static String BinaryWithoutRecursion(int n) {
              StringBuilder str = new StringBuilder();
              if (n == 0) {
                  return "0";
              }
             while(n>0){
              str.append(n%2);
              n/=2;
             }
              return str.reverse().toString();
          }
       static int decimalFind(String s) {
              int res=0;
             for (int i = 0; i < s.length(); i++) {
               int b=s.charAt(s.length()-1-i)-'0';
                res=(int) (res+b*Math.pow(2,i));
             }
             return res;
          }
}
