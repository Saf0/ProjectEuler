import java.util.ArrayList;


public class p23 extends EulerProblem {
    
    boolean[] abudant;

    public static void main(String[] args) {
        
        EulerProblem e = new p23();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        abudant = new boolean[28123];
        
        for (int i = 1; i < abudant.length; i++) {
            abudant[i] = isAbundant(i);
        }
        
        
        int sum = 0;
        for (int i = 0; i <= 28123; i++) {
            if (!isSumOfAbudants(i)) {
                sum += i;
            }
        }
        
        this.result = sum + "";
        
    }
    
    public ArrayList<Integer> getDivisors(int n) {
        
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        
        int to = (int) Math.sqrt(n);
        divisors.add(1);
        
        for (int i = 2; i <= to; i++) {
            if (n % i == 0) {    
                divisors.add(i);
                if (i != (n / i)) {
                    divisors.add(n / i);
                }
            }
        }
        
        return divisors;
        
    }
    
    public boolean isAbundant(int n) {
        
        ArrayList<Integer> d = getDivisors(n);
        
        int sum = 0;
        for (Integer integer : d) {
            sum += integer;
        }
        
        if (sum > n) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean isSumOfAbudants(int n) {
        
        for (int i = 1; i < n; i++) {
            
            if (abudant[i] && abudant[n - i]) {
                return true;
            }
            
        }
        
        return false;
        
    }

}
