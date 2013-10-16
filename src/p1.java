
public class p1 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p1();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        int sum = 0;
        
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        
        this.result = sum + "";
        
    }

}
