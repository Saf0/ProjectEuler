import java.util.Scanner;


public class EulerProblem {
    
    protected String result;
    protected Scanner sc;
    
    public void computeResult() {
        
    }
    
    public void showResult() {
        
        String className = this.getClass().getSimpleName();
        System.out.println("Soluton of Problem " + className.substring(1) + " is " + result);
        
    }
    
    public void setResult(int x) {
        this.result = x + "";
    }
    
}
