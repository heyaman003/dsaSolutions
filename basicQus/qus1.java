package basicQus;

public class qus1 {
       public static void main(String[] args) {
              String s = "Aman is good boy";
              System.out.println(palindromecheeker(s));
              System.out.println(reverse(s));
       }

       static boolean palindromecheeker(String s) {
              for (int i = 0; i < s.length(); i++) {
                     if ((s.charAt(i) - '0') != (s.charAt(s.length() - i - 1) - '0'))
                            return false;
              }
              return true;
       }

       static String reverse(String s) {
              String r = "";
              for (int i = 0; i < s.length(); i++) {
                     r = s.charAt(i) + r;
              }
              return r;
       }

}
