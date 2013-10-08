
public class p12 {
    
    public static void main(String[] args) {
        
        int i = 2;
        int num = 1;
        
        while (true) {
            
            if (numberOfDivisors(num) >= 500) {
                System.out.println(num);
                break;
            }
            
            num += i;
            i++;
            
        }
        
    }
    
    public static int numberOfDivisors(int n) {
        
        int out = 0;
        int to = (int) Math.sqrt(n);
        
        for (int i = 1; i <= to; i++) {
            if (n % i == 0) {
                out += 2;
            }
        }
        
        return out;
        
    }

}
