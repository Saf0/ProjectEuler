import java.math.BigInteger;

public class p16 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p16();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        BigInteger n = new BigInteger("2");
        n = n.pow(1000);
        
        String number = n.toString();
        int digit = 0;
        int sum = 0;
        
        for (int i = 0; i < number.length(); i++) {
            digit = number.codePointAt(i) - 48;
            sum += digit;
        }
        
        this.result = sum + "";
        
    }

}
