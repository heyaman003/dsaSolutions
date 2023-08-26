package Accenture.aman;

import java.util.HashSet;
import java.util.Set;

public class findsubstring {
       public static void main(String[] args) {
           String s1="aaabccc";
           System.out.println( lengthOfLongestSubstring(s1));
          
       }
       static int lengthOfLongestSubstring(String s){
                     int start=0;
                     int end=0;
                     int max=0;
                     Set<Character> myset=new HashSet<>();
                     int n=s.length();
                     while(end<n&&start<=end){
                         if(!myset.contains(s.charAt(end))){
                             myset.add(s.charAt(end));
                             int assumption=end-start+1;
                             max=Math.max(max,assumption);
                             end++;
                         }
                         else{
                             myset.remove(s.charAt(start));
                             start++;
                         }
                     }
                     
                   return max;  
           }
}
