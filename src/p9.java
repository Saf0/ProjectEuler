
public class p9 {

    public static void main(String[] args) {
        
        for (int b = 1; b < 500; b++) {
            for (int a = 1; a < b; a++) {
                
                int lava = a*a + b*b;
                double c = Math.pow(lava, 0.5);
                
                if (c == Math.round(c)) {
                    
                    int sum = a + b + (int)(c);
                    
                    if (sum == 1000) {
                        System.out.println("a = " + a);
                        System.out.println("b = " + b);
                        System.out.println("c = " + c);
                        System.out.println("product = " + (a * b * (int)(c)));
                        return;
                    }
                }
                
            }
        }
        

    }

}
