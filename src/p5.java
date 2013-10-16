
public class p5 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p5();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        long i = 1;
        
        while(!isGood(i)) {
            i++;
        }
        
        this.result = i + "";
        
    }
    
    public static boolean isGood(long n) {
        
        for (int i = 1; i < 20; i++) {
            if (n % i != 0) return false;
        }
        
        return true;
    }

}
