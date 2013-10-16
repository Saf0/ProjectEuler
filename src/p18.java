import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p18 extends EulerProblem {
    
    private Scanner sc;
    private int n;
    private String filename;
    
    public static void main(String[] args) {
        
        EulerProblem e = new p18(15, "p18.txt");
        e.computeResult();
        e.showResult();
        
    }
    
    public p18(int n, String f) {
        this.n = n;
        this.filename = f;
    }
   
    @Override
    public void computeResult() {
           
    try {
        sc = new Scanner(new File(this.filename));
       
        int[][] p = new int[n][n];
       
        for(int i = 0; i < n; i++) {
              
            for (int j = 0; j <= i; j++) {
                p[j][i] = sc.nextInt();
            }
      
        }
    
        for(int i = (n - 2); i >= 0; i--) {
              
            for (int j = 0; j <= i; j++) {
                int l = p[j][i] + p[j][i + 1];
                int r = p[j][i] + p[j + 1][i + 1];
                p[j][i] = Math.max(l, r);
            }
      
        }
    
        this.result = p[0][0] + "";
           
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
       
}
       
       
     
}

