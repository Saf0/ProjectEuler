
public class p5 {

    public static void main(String[] args) {
        
        long i = 1;
        
        while(!isGood(i)) {
            i++;
        }
        
        System.out.println(i);

    }
    
    public static boolean isGood(long n) {
        
        for (int i = 1; i < 20; i++) {
            if (n % i != 0) return false;
        }
        
        return true;
    }

}
