public class demo {
       public static void main(String[] args) {
              String S="";
              String R=" ";
              for (int i=0;i<S.length();i++) {
              R=S.charAt(i)+R;
              }
              System.out.println(R);
              int res=0;
              for (int j=1;j<S.length ();j++) {
                     System.out.println(S.charAt (j) -S.charAt (j-1));
                     System.out.println(R. charAt (j) -R. charAt (j-1));
              if(S.charAt (j) -S.charAt (j-1)!=R. charAt (j) -R. charAt (j-1) ){
              System.out.println("0");
              return;
              }
              else{
             res=1;
              }
              }
              System.out.println(res);
       }
}

