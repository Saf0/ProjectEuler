
public class p4 extends EulerProblem {

    public static void main(String[] args) {
        
        EulerProblem e = new p4();
        e.computeResult();
        e.showResult();

    }
    
    @Override
    public void computeResult() {
        
        int max = 1;
        int product = 0;
        
        for (int i = 1; i < 999; i++) {
            for (int j = 1; j < 999; j++) {
                product = i * j;
                if (isPalindrome(product) && product > max)
                    max = product;
            }
        }
        
        this.result = max + "";
        
    }
    
    public static boolean isPalindrome(int n) {
        String s = n + "";
        
        char digit[] = new char[s.length()];
        for (int i = 0; i < digit.length; i++) {
            digit[i] = s.charAt(i);
        }
        
        for (int i = 0; i < (digit.length / 2); i++) {
            if (digit[i] != digit[digit.length - i - 1]) 
                return false;
        }
        
        return true;
    }

}
