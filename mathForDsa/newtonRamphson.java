package mathForDsa;

public class newtonRamphson {
       public static void main(String[] args) {
              double n=10;
              System.out.println(newtonji(10));
       }
       static double newtonji(double n){
            double root;
            double x=n/2;
              while(true){
              root=(x+n/x)/2;
              if(Math.abs(root-x)<0.5)
              break;
              else x=root;
             }
             return root;
       }
}
