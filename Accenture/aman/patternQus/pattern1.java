package Accenture.aman.patternQus;

public class pattern1 {
       public static void main(String[] args) {
              int n=6;
              patter01(n);
              System.out.println();
              System.out.println();
              patter02(n);
              System.out.println();
              System.out.println();
              patter03(n);
           

       }
       static void patter01(int n){
           for (int i = 0; i < n; i++) {
              for (int j = 0; j < i+1; j++) {
                     System.out.print("*");
              }
              System.out.println();
           }
       }
       static void patter02(int n){
           for (int i = 0; i < n; i++) {
              for (int j = 0; j <n; j++) {
                     System.out.print("*");
              }
              System.out.println();
           }
       }
       static void patter03(int n){
           for (int i = 0; i < n; i++) {
              for (int j = n-i; j >0; j--) {
                     System.out.print("*");
              }
              System.out.println();
           }
       }
      
  

             
   
}
