import java.math.BigInteger;


public class p25 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p25();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        BigInteger f1 = new BigInteger("1");
        BigInteger f2 = new BigInteger("1");
        BigInteger temp;
        
        int i = 2;
        while (true) {
            
            i++;
            temp = f1;
            f1 = f1.add(f2);
            f2 = temp;
            
            if (f1.toString().length() >= 1000) {
                this.result = i + "";
                break;
            }

        }
        
    }

}
