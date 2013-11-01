import java.util.ArrayList;


public class p26 extends EulerProblem {

    public static void main(String[] args) {

        EulerProblem e = new p26();
        e.computeResult();
        e.showResult();
        
    }
    
    @Override
    public void computeResult() {
        
        String rd = "";
        int max = 0;
        int maxI = 0;
        
        for (int i = 1; i < 1000; i++) {
            
            rd = getRepeatingDecimal(1, i);
            
            if (rd != null) {
                if (rd.length() > max) {
                    max = rd.length();
                    maxI = i;
                }
            }
            
        }
        
        this.result = maxI + "";
        
    }
    
    public String getRepeatingDecimal(int a, int b) {
        
        String result = "";
        ArrayList<Integer> p = new ArrayList<Integer>();
        
        while (a != 0) {
            
            while (a < b) {
                a = a * 10;
                result += "0";
            }
            
            if (p.contains(a)) {
                
                // we found repeating
                
                int from = p.indexOf(new Integer(a));
                return result.substring(from + 1);
                
            } else {
                
                p.add(a);
                result += (a / b) + "";
                a = a % b;
                a *= 10;
                
            }
            
        }
        
        return null;
        
    }

}
