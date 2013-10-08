import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class p13 {

    static Scanner sc;
    public static void main(String[] args) {
        
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
            
            System.out.println(sum);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }

}
