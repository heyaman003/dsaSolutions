package heyStrings;

public class toggle {
       public static void main(String[] args) {
              String s="aManKumar";
              System.out.println(toggleing(s));
       }
       static String toggleing(String s1) {
              char arr[] = s1.toCharArray();
              for (int i = 0; i < arr.length; i++) {
                  char c = arr[i];
                  if (c >= 'A' && c <= 'Z') {
                      arr[i] = (char) (c + 'a' - 'A');
                  } else if (c >= 'a' && c <= 'z') {
                      arr[i] = (char) (c + 'A' - 'a');
                  }
              }
              
              return new String(arr);
          }
          
       
}
