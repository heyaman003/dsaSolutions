package Accenture.codingexam;

public class test {
      public static void main(String[] args) {
       String s1="amannama";
       System.out.println(normal(s1));
      } 
      static int normal(String s2){
       int ans=0;
          char arr[]=new char[s2.length()-1];
          for(int i=0;i<s2.length()-1;i++){
              arr[i]=s2.charAt(s2.length()-1-i);
          }
          for (int i = 0; i < s2.length()-1; i++) {
              if(arr[i]==s2.charAt(i))
              ans++;
          }

       return ans;
      }
}
