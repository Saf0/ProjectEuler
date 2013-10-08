
public class p6 {

    public static void main(String[] args) {
        
        System.out.println(squareOfTheSum(100)-sumOfTheSquares(100));

    }
    
    public static int sumOfTheSquares(int n) {
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i*i;
        }
        
        return sum;
        
    }
    
    public static int squareOfTheSum(int n) {
        
        int sq = 0;
        
        for (int i = 1; i <= n; i++) {
            sq += i;
        }
        
        sq = sq*sq;
        
        return sq;
        
    }

}
