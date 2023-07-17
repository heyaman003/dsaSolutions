package hashmapInJava;

import java.util.HashMap;
import java.util.Set;

public class hellohashmap {
       public static void main(String[] args) {
              HashMap<String,Integer> hello=new HashMap<>();
              hello.put("aman", 10);
              hello.put("ayush", 210);
              hello.put("anand", 220);
              hello.put("aman", 20);
              System.out.println(hello);
              System.out.println(hello.containsKey("aman"));
              System.out.println(hello.containsKey("jui"));
              System.out.println(hello.get("jui"));
              System.out.println(hello.get("aman"));
              System.out.println(hello.size());
              System.out.println(hello.isEmpty());
              System.out.println(hello.remove("aman"));
             /*  hello.clear();
              System.out.println(hello); */
              //iterate on map using set
              Set<String> key=hello.keySet();
              System.out.println(key);
              for (String string : key) {
                     System.out.println(string+","+hello.get(string));
              }

       }
       
}
