import java.math.BigInteger;


public class p15 extends EulerProblem {
    
    int n;

    public static void main(String[] args) {
        
        EulerProblem e = new p15();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        n = 20;        
        this.result = combination(2 * n, n) + "";
        
    }
    
    public BigInteger combination(int n, int k) {
        
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
        
    }
    
    public BigInteger factorial(int n) {
        
        BigInteger f = BigInteger.ONE;
        
        for (int i = 1; i <= n; i++) {
            f = f.multiply(new BigInteger(i+""));
        }
        
        return f;
        
    }

}
