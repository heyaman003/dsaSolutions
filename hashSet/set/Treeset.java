package hashSet.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
       public static void main(String[] args) {
           TreeSet<String> myFristSet=new TreeSet<>();
             myFristSet.add("jui"); 
             myFristSet.add("aman");
              myFristSet.add("aman");
              myFristSet.add("aman");
              myFristSet.add("aman");
              myFristSet.add("aman");
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
