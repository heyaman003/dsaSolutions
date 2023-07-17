package heyStrings;

import java.util.Arrays;

public class alphabets {
       public static void main(String[] args) {
              char[] albhabet=new char[26];
            
             for (int j = 0; j < albhabet.length; j++) {
                albhabet[j]=(char)('a'+j);
             }
             System.out.println(Arrays.toString(albhabet));
             for (char c : albhabet) {
              if(c=='a'||c=='e'||c=='i'|| c=='o'||c=='u'){
                    System.out.println(c +"is vowel");
              }
              System.out.println(c+"is consonant");
             }
       }
}
