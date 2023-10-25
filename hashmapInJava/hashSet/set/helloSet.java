package hashmapInJava.hashSet.set;

import java.util.HashSet;
import java.util.Iterator;

public class helloSet {
       public static void main(String[] args) {
              HashSet<String> myFristSet=new HashSet<>();
              myFristSet.add("aman");
              myFristSet.add("aman");
              myFristSet.add("aman");
              myFristSet.add("aman");
              myFristSet.add("aman");
              myFristSet.add("jui");
              myFristSet.add("ayush");
              myFristSet.add("shubham");
       
              System.out.println(myFristSet);
              System.out.println(myFristSet.size());
              System.out.println(myFristSet.contains("aman"));
              Iterator it=myFristSet.iterator();
               while (it.hasNext()) {
                           System.out.println(it.next()); 
                     }
           //or we can iterate like 
             for (String string : myFristSet) {
              System.out.println(string);
             }
             
       }
}
