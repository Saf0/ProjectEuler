
public class p12 extends EulerProblem {
    
    public static void main(String[] args) {
        
        EulerProblem e = new p12();
        e.computeResult();
        e.showResult();
        
    }
    
    @Override
    public void computeResult() {
        
        int i = 2;
        int num = 1;
        
        while (true) {
            
            if (numberOfDivisors(num) >= 500) {
                this.result = num + "";
                break;
            }
            
            num += i;
            i++;
            
        }
        
    }
    
    public static int numberOfDivisors(int n) {
        
        int out = 0;
        int to = (int) Math.sqrt(n);
        
        for (int i = 1; i <= to; i++) {
            if (n % i == 0) {
                out += 2;
            }
        }
        
        return out;
        
    }

}
