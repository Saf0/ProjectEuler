
public class p2 {

    public static void main(String[] args) {
        
        int f1 = 1;
        int f2 = 1;
        int buff;
        int sum = 0;
        
        while (f2 < 4000000) {
            
            buff = f2;
            f2 = f1 + f2;
            f1 = buff;
            
            if (f2 % 2 == 0) sum += f2;
            
        }
        
        System.out.println(sum);

    }

}
