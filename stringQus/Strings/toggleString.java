public class toggleString {
       public static void main(String[] args) {
        String s1="256.256.256.256";
            System.out.println(isValid(s1));
             
       }
      static boolean hasLeadingZero(String n)
       { // check if every split has leading zero or not.
           if (n.length() > 1) {
               if (n.charAt(0) == '0') {
                   return true;
               }
           }
           return false;
       }
   
    static boolean isValid(String s) {
           // Write your code here
           String str[]=s.split("\\.");
           if(str.length!=4)
           return false;
           for(String s1:str){
               if(hasLeadingZero(s1))
               return false;
               if (s1.length() == 0) {
                   return false;
               }
                try {
                   int num = Integer.parseInt(s1);
                   if (num<=0&&num>=255) {
                       return false;
                   }
                   
               }
               catch (NumberFormatException e) {
                   return false;
               }
             
           }
             return true;
           }
      
}
