
public class p30 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p30();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        int sum = 0;
        
        for (int i = 2; i < 354294; i++) {
            if (isSumOfPowers(i, 5)) {
                sum += i;
            }
        }
        
        setResult(sum);
        
    }
    
    public boolean isSumOfPowers(int n, int pow) {
        
        String s = n + "";
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int c = s.codePointAt(i) - 48;
            sum += Math.pow(c, pow);
        }
        
        if (n == sum) {
            return true;
        } else {
            return false;
        }
        
    }

}
