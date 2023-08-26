package recursion.StringRelatedQus;

public class BasicToggle {
       public static void main(String[] args) {
              String str="baabaacbbma";
                 StringBuilder str1=new StringBuilder();
              System.out.println(RecursiveApporach(str, 0,str1));
              System.out.println(normalApproach(str));
              System.out.println(anotherAppRecursive(str));
       }
       static StringBuilder RecursiveApporach(String s,int len,StringBuilder str){
             
                if(s.length()==len)
             return str;
             if(s.charAt(len)!='a')
              str.append(s.charAt(len));
              RecursiveApporach(s, len+1,str);
              return str;
       }
       static StringBuilder normalApproach(String s){
              StringBuilder s1=new StringBuilder();
              int count=0;
              while (count<s.length()) {
                    if(s.charAt(count)!='a') 
                    s1.append(s.charAt(count));
                    count++;
              }
              return s1;
       }
        static String anotherAppRecursive(String s){
              if(s.isEmpty())
              return "";
             char ch=s.charAt(0);
             if(ch=='a')
             return anotherAppRecursive(s.substring(1));
             else
             return ch+anotherAppRecursive(s.substring(1));
        }
}
