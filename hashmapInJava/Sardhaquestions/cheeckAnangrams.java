package hashmapInJava.Sardhaquestions;

import java.util.Arrays;
import java.util.HashMap;

public class cheeckAnangrams {
       public static void main(String[] args) {
            String str1="hello";
            String str2="hlleo";
           System.out.println( isAnagram(str1, str2));
           System.out.println( isAnagram2(str1, str2));
       
       }
       static boolean isAnagram(String str1, String str2) {
              HashMap<Character, Integer> myMap = new HashMap<>();
              if (str1.length() != str2.length())
                  return false;
              for (int i = 0; i < str1.length(); i++) {
                char ch=str1.charAt(i);
                  myMap.put(ch, (myMap.getOrDefault(ch,0)+1));
                  /* myMap.put(ch, myMap.get(ch) + 1);
              else
                  myMap.put(ch, 1); */
              }
              for (int i = 0; i < str2.length(); i++) {

                char ch=str2.charAt(i);//key

                  if (myMap.get(ch) != null) {
                    if (myMap.get(ch) == 1) myMap.remove(ch);
                   else  myMap.put(ch, myMap.get(ch) - 1);  
                  }
              }
              return( myMap.size() == 0);
          }
          static boolean isAnagram2(String str1, String str2){
            
           if(str1.length()!=str2.length())
           return false;
            char arr1[] =str1.toCharArray();
            char arr2[] =str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
           for (int i = 0; i < arr2.length; i++) {
            if(arr1[i]!=arr2[i])
            return false;
           }
            return true;

          }
          public static boolean isAnagram3(String str1, String str2) {
            if (str1.length() != str2.length())
                return false;
        
            int[] charCount = new int[26]; // Assuming only lowercase letters are considered
        
            for (int i = 0; i < str1.length(); i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);
        
                charCount[c1 - 'a']++;
                charCount[c2 - 'a']--;
            }
        
            for (int count : charCount) {
                if (count != 0)
                    return false;
            }
        
            return true;
        }
          
        
}
