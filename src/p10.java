
public class p10 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p10();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        int n = 2000000;
        
        boolean[] p = new boolean[n];
        int limit = (int) Math.sqrt(n);
        
        for (int i = 2; i < limit; i++) {
            if (p[i] == false) {
                for (int j = (2 * i); j < n; j += i) {
                    p[j] = true;
                }
            }
        }
        
        long sum = 0;
        for (int i = 2; i < n; i++) {
            
            if (p[i] == false) {
                sum += i;
            }
            
        }
        
        this.result = sum + "";
        
    }

}
