package heyStrings;

public class palindromeString {
       public static void main(String[] args) {
              String str = "1321";
             System.out.println((reverse(str).equals(str)));
            System.out.println(reverse2(str));
              reverse2(str);
             

       }

       static String reverse(String s) {
              // char [] heystring=new char[45];
              char[] heyString = s.toCharArray();
              int start = 0;
              int end = heyString.length - 1;
              for (int i = 0; i < heyString.length / 2; i++) {
                     heyString[start] ^= heyString[end];
                     heyString[end] ^= heyString[start];
                     heyString[start] ^= heyString[end];
                     end--;
                     start++;
              }
              return new String(heyString);
       }

       static boolean reverse2(String s) {
              System.out.println(Character.isLetterOrDigit('.'));

              int start = 0;
              int end = s.length() - 1;
              for (int i = 0; i < s.length() - 1; i++) {
                     if (s.charAt(start) != s.charAt(end))
                            return false;
                     start++;
                     end--;
              }
              return true;
       }
}
