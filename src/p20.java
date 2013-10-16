import java.math.BigInteger;

public class p20 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p20();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        BigInteger n = BigInteger.ONE;
        for (int i = 2; i <= 100; i++) {
            n = n.multiply(new BigInteger(""+i));
        }
        
        String s = n.toString();
        
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.codePointAt(i) - 48);
        }
        
        this.result = sum + "";
        
    }

}
