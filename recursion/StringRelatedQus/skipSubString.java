package recursion.StringRelatedQus;

public class skipSubString {
       public static void main(String[] args) {
              String str=" hey aman i love you aman";
              System.out.println(usingNormalcall(str));
       }

    static String usingNormalcall(String str) {
       String result = "";
       int count = 0;
       while (count < str.length()) {
           if (!str.startsWith("aman",count)) {
               result += str.charAt(count);
               count++;
           } else {
               count += 4; // Skip "aman"
           }
       }
       return result;
       }
}
