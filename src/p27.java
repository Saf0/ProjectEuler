
public class p27 extends EulerProblem {
    
    boolean[] primes;

    public static void main(String[] args) {
        
        EulerProblem e = new p27();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        createSieve(1000000);
        
        int max = 0;
        int product = 0;
        
        for (int a = -1000; a < 1000; a++) {
            for (int b = -1000; b < 1000; b++) {
                int n = getNumberOfPrimes(a, b);
                if (n > max) {
                    max = n;
                    product = a * b;
                }
            }
        }
        
        this.result = product + "";
        
    }
    
    public int getNumberOfPrimes(int a, int b) {
        
        int p = 0;
        int n = -1;
        
        do {
            n++;
            p = (n * n) + (n * a) + b;
        } while (p > 0 && isPrime(p));
        
        return n;
        
    }
    
    public boolean isPrime(int n) {
        return !primes[n];
    }
    
    public void createSieve(int n) {
        
        primes = new boolean[n];
        int limit = (int) Math.sqrt(n);
        
        for (int i = 2; i < limit; i++) {
            if (primes[i] == false) {
                for (int j = (2 * i); j < n; j += i) {
                    primes[j] = true;
                }
            }
        }
        
    }

}
