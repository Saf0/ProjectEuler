
public class p9 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p9();
        e.computeResult();
        e.showResult();
        
    }
    
    @Override
    public void computeResult() {
        
        for (int b = 1; b < 500; b++) {
            for (int a = 1; a < b; a++) {
                
                int lava = a*a + b*b;
                double c = Math.pow(lava, 0.5);
                
                if (c == Math.round(c)) {
                    
                    int sum = a + b + (int)(c);
                    
                    if (sum == 1000) {
                        this.result = (a * b * (int)(c)) + "";
                        return;
                    }
                }
                
            }
        }
        
    }

}
