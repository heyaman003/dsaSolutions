package heyStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class hello {
       public static void main(String[] args) {
              System.out.println("a"+"b");
              System.out.println('a'+'b');
              System.out.println('a'+3);
              System.out.println((char)('a'+3));
              char x='a';
              System.out.println((int)(x));
              System.out.println("a"+3);
              //when an integer is concated with string it converted in it's wrapper class
              //i.e Integer and it will call to  string and thst to string method wiill return "1";
              int arr[]={2,3,4,5};
              System.out.println("a"+Arrays.toString(arr));
              System.out.println(new ArrayList<>()+"A"+new Integer(78));
              int arrr[]={1,2,3,4,5};
              System.out.println(arrr);
              char []chararray={'a','b','c'};
              System.out.println(chararray);
       }
       
}
