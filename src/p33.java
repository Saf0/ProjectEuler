public class p33 extends EulerProblem {

    public static void main(String[] args) {
        EulerProblem e = new p33();
        e.computeResult();
        e.showResult();
    }

    @Override
    public void computeResult() {
        int sum = 0;
        for (int i = 3; i < 1000000; i++) {
            if (factorialSum(i) == i) {
                sum += i;
            }
        }
        result = sum+"";
    }

    public long factorialSum(long n) {
        String s = n + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += factorial(s.codePointAt(i) - 48);
        }
        return sum;
    }

    public long factorial(long n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
