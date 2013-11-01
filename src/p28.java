
public class p28 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p28();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        int n = 1001;
        
        int length = n - 1;
        int x = n * n;
        int sum = x;
        
        while(length > 0) {
            
            for (int j = 0; j < 4; j++) {
                x -= length;
                sum += x;
            }
            
            length -= 2;
            
        }
        
        setResult(sum);
        
        
    }

}
