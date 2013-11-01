
public class p24 extends EulerProblem {

    private int i;
    private boolean end = false;
    
    public static void main(String[] args) {

        EulerProblem e = new p24();
        e.computeResult();
        e.showResult();
        
    }
    
    @Override
    public void computeResult() {
        
        permutation("", "0123456789");
        
    }

    private void permutation(String prefix, String str) {
        
        if (end) return;
        
        int n = str.length();
        if (n == 0) {
            i++;
            if (i == 1000000) {
                
                this.result = prefix;
                end = true;
            }

        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    
}
