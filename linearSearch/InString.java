package linearSearch;
import java.util.Scanner;
public class InString {
    public static void main(String[] args) {
       System.out.println("enetr a string ");
       Scanner in=new Scanner(System.in);
       String str=in.nextLine();
       System.out.println("enter a char you want to search");
       char k=in.next().charAt(0);
  System.out.println(SearchStringLinear(str, k));
    } 
    public static boolean SearchStringLinear(String str,char x){
       if(str.length()==0) return false;
       for (char ch :str.toCharArray() ) {
             if(ch==x)
             return true; 
       }
  return false;
    }  
}
