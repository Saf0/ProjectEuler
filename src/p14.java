
public class p14 {

    public static void main(String[] args) {
        
        int maxCollatz = 0;
        int maxStarting = 0;
        int c = 0;
        
        for (int i = 1; i < 1000000; i++) {
            
            c = collatz(i);
            if (c > maxCollatz) {
                maxCollatz = c;
                maxStarting = i;
            }
            
        }
        
        System.out.println(maxStarting);
    }
    
    public static int collatz(long n) {
        
        int out = 1;
        
        while (n != 1) {
            
            if (n % 2 == 0) { // even
                n = n / 2;
            } else { // odd
                n = 3 * n + 1;
            }
            
            out++;
            
        }
        
        return out;
        
    }

}
