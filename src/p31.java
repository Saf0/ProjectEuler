public class p31 extends EulerProblem {

    public static void main(String[] args) {
        EulerProblem e = new p31();
        e.computeResult();
        e.showResult();
    }

    @Override
    public void computeResult() {
        int value = 200;
        int results = 0;
        for (int a = value; a >= 0; a -= 200) {
            for (int b = a; b >= 0; b -= 100) {
                for (int c = b; c >= 0; c -= 50) {
                    for (int d = c; d >= 0; d -= 20) {
                        for (int e = d; e >= 0; e -= 10) {
                            for (int f = e; f >= 0; f -= 5) {
                                for (int g = f; g >= 0; g -= 2) {
                                    results++;
                                }
                            }
                        }
                    }
                }
            }
        }
        result = results+"";
    }
}
