
public class p2 extends EulerProblem {
    
    public static void main(String[] args) {
        
        EulerProblem e = new p2();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        int f1 = 1;
        int f2 = 1;
        int buff;
        int sum = 0;
        
        while (f2 < 4000000) {
            
            buff = f2;
            f2 = f1 + f2;
            f1 = buff;
            
            if (f2 % 2 == 0) sum += f2;
            
        }
        
        this.result = sum + "";
        
    }

}
