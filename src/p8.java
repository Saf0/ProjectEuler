import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class p8 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p8();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        try {
            sc = new Scanner(new File("p8.txt"));
            
            String number = "";
            while(sc.hasNextLine()) {
                number += sc.nextLine();
            }
            
            int x;
            int max = 0;
            for (int i = 0; i < number.length()-4; i++) {
                x = (number.codePointAt(i) - 48);
                x *= (number.codePointAt(i+1) - 48);
                x *= (number.codePointAt(i+2) - 48);
                x *= (number.codePointAt(i+3) - 48);
                x *= (number.codePointAt(i+4) - 48);
                if (x > max) {
                    max = x;
                }
            }
            
            this.result = max + "";
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }

}
