package basicQus;

public class squareRoot {
       public static void main(String[] args) {
              System.out.println(brutForce(10));
              System.out.println(binaryWay(10));
       }
       static int brutForce(int n){
              int i;
              for ( i = 0; i*i<=n; i++) {
                   if(i*i==n)
                   return n;  
              }
            return i-1;
             
       }
       static double binaryWay(int n){
              int start=0;
              int end=n;
              while(start<=end){
                     int mid=start+(end-start)/2;
                     if(mid*mid==n)
                     return mid;
                     if(mid*mid>n){
                            end=mid-1;
                     }
                     else start=mid+1;
              }
            double root=(double)end;
             double inc=0.1;
             for(int i=0;i<3;i++){
              while(root*root<=n){
                  root+=inc;
              }
              root-=inc;
              inc/=10;
             }
             return root;
       }
}
