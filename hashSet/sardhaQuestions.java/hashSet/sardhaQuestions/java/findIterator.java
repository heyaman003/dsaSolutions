import java.util.HashMap;

public class findIterator {
       static String Findstart(HashMap<String,String> iterator){
              HashMap<String,String> reverseMap=new HashMap<>();
              for (String city : iterator.keySet()) {
                     reverseMap.put(iterator.get(city), city);
              }
              for (String key : iterator.keySet()) {
                      if(!reverseMap.containsKey(key))
                      return key;
              }
             
            return "ab";
       }
       public static void main(String[] args) {
              HashMap<String,String> iterator=new HashMap<>();
              iterator.put("chennai","bengaluru");
              iterator.put("mumbai","delhi");
              iterator.put("goa","chennai");
              iterator.put("delhi","goa");

              String start=(Findstart(iterator));
              System.out.print(start);
              for (String key : iterator.keySet()) {
                 System.out.print("->"+iterator.get(start));
                 start=iterator.get(start);    
              }
       }
}
