
public class p6 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p6();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        this.result = (squareOfTheSum(100) - sumOfTheSquares(100)) + "";
        
    }
    
    public static int sumOfTheSquares(int n) {
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i*i;
        }
        
        return sum;
        
    }
    
    public static int squareOfTheSum(int n) {
        
        int sq = 0;
        
        for (int i = 1; i <= n; i++) {
            sq += i;
        }
        
        sq = sq*sq;
        
        return sq;
        
    }

}
