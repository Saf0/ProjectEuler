import java.math.BigInteger;
import java.util.HashSet;


public class p29 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p29();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        HashSet<String> set = new HashSet<>();
        
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                
                set.add(new BigInteger(a+"").pow(b).toString());
                
            }
        }
        
        setResult(set.size());
        
    }

}
