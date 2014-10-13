import java.util.HashSet;
import java.util.Iterator;

public class p32 extends EulerProblem {

    public static void main(String[] args) {
        EulerProblem e = new p32();
        e.computeResult();
        e.showResult();
    }

    @Override
    public void computeResult() {

        HashSet<Integer> products = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < i; j++) {
                int product = i * j;
                if (isPandigital(i, j, product)) {
                    products.add(product);
                    //System.out.println(i+" × "+j+" = "+product);
                }
            }
        }
        int sum = 0;
        for (Iterator<Integer> iterator = products.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            sum += next;
        }
        result = sum+"";

    }

    public boolean isPandigital(int a, int b, int c) {
        String s = a + "" + b + "" + c;
        if (s.length() != 9) {
            return false;
        }
        int[] digits = new int[10];
        for (int i = 0; i < s.length(); i++) {
            digits[s.charAt(i)-48]++;
        }
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 1) {
                return false;
            }
        }
        return true;
    }
}
