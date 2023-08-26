package basicQus;

public class nthPrimeno {
       public static void main(String[] args) {
              int n=10;
              System.out.println(Primefind(10));
       }
       static int Primefind(int n){
              int limit = 1000000; // Adjust this limit based on the expected range of nth prime.

              boolean[] primes = new boolean[limit + 1];
              for (int i = 2; i <= limit; i++) {
                  primes[i] = true;
              }
      
              int primeCount = 0;
              for (int p = 2; p*p <= limit; p++) {
                  if (primes[p]) {
                      primeCount++;
                      if (primeCount == n) {
                          return p;
                      }
      
                      for (int i = p * 2; i <= limit; i += p) {
                          primes[i] = false;
                      }
                  }
              }
      
              return 0;
       }
}
