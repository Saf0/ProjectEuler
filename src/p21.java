import java.util.ArrayList;

public class p21 extends EulerProblem {

    public static void main(String[] args) {

        EulerProblem e = new p21();
        e.computeResult();
        e.showResult();
        
    }
    
    @Override
    public void computeResult() {
        
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            if (isAmicable(i)) {
                sum += i;
            }
        }
        
        this.result = sum + "";
        
    }
    
    public static ArrayList<Integer> getDivisors(int n) {
        
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        
        int to = (int) Math.sqrt(n);
        divisors.add(1);
        
        for (int i = 2; i <= to; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        
        return divisors;
        
    }
    
    public static int sumOfDivisors(int n) {
        
        int sum = 0;
        ArrayList<Integer> divisors = getDivisors(n);
        for (Integer integer : divisors) {
            sum += integer;
        }
        return sum;
        
    }
    
    public static boolean isAmicable(int n) {
        
        int sum = sumOfDivisors(n);
        int sum2 = sumOfDivisors(sum);
        
        if (n == sum2 && sum != sum2) {
            return true;
        } else {
            return false;
        }
        
    }

}
