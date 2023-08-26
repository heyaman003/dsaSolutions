public class leetcodePrime {
       public static void main(String[] args) {
              int n=10;
              //System.out.println(brutforce(n));
              System.out.println(bestApp(n));
       }
       static int brutforce(int n){
              if(n==0||n==1)
              return 0;
              int count=0;
              int j=0;
           for(int i=2;i<n;i++){
             for(j=2;j<i;j++){
                 if(i%j==0){
                   break;
                 }
             }
                 if(i==j)
                 count++;
             }
             return count;
       }
       static int bestApp(int n){
              if(n==0||n==1)
              return 0;
              boolean b[]=new boolean[n+1];
              b[0]=true;
              b[1]=true;
              for (int i = 2; i <b.length; i++) {
                 if(!b[i]){
                     for (int j = i*i; j <b.length; j+=i) {
                          b[j]=true;  
                     }
                 }    
              }
              int count=0;
              for (int i = 0; i < b.length; i++) {
                     if(!b[i])
                     count++;
              }
              return count;
       }
}
