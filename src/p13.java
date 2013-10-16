import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class p13 extends EulerProblem {

    static Scanner sc;
    
    public static void main(String[] args) {
        
        EulerProblem e = new p13();
        e.computeResult();
        e.showResult();
        
    }
    
    @Override
    public void computeResult() {
        
        try {
            sc = new Scanner(new File("p13.txt"));
            
            BigInteger[] nums = new BigInteger[100];
            
            for (int i = 0; i < nums.length; i++) {
                nums[i] = new BigInteger(sc.nextLine());
            }
            
            BigInteger sum = BigInteger.ZERO;
            
            for (int i = 0; i < nums.length; i++) {
                sum = sum.add(nums[i]);
            }
            
            this.result = sum.toString().substring(0, 10) + "";
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }

}
