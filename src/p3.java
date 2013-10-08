import java.math.BigInteger;
import java.util.ArrayList;


public class p3 {

    public static void main(String[] args) {
        
        long num = 600851475143L;
        long d = 2;
        ArrayList<Long> primes = new ArrayList<Long>();
        
        while(true) {
            
            if (num % d == 0) {
                num = num / d;
                primes.add(d);
                if (new BigInteger(num+"").isProbablePrime(10)) {
                    primes.add(num);
                    break;
                }
            } else {
                d++;
            }
            
        }
        
        System.out.println(primes);

    }

}
