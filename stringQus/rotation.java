package stringQus;

public class rotation {
       public static void main(String[] args) {
              String s1="Aman";
              String s2="sanT";
              if(s1.length()!=s2.length()){
              System.out.println("no it is not rotade");
               return;
              }
              String temp=s1+s1;
              if(temp.contains(s2))
              System.out.println("yes it is rotated");
              else System.out.println("no it is not");
       }
}
