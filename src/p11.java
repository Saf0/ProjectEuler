import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class p11 {

    public static void main(String[] args) {
        
        try {
            
            int n = 20;
            
            Scanner sc = new Scanner(new File("p11.txt"));
            int grid[][] = new int[n][n];
            
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            
            int max = 0;
            
            // columns
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-3; j++) {
                    if (grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3] > max) {
                        max = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
                    }
                }
            }
            
            // rows
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n-3; i++) {
                    if (grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j] > max) {
                        max = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
                    }
                }
            }
            
            // diagonal  left-right
            for (int i = 0; i < n-3; i++) {
                for (int j = 0; j < 17-i; j++) {
                    if (grid[j][i] * grid[j+1][i+1] * grid[j+2][i+2] * grid[j+3][i+3] > max) {
                        max = grid[j][i] * grid[j+1][i+1] * grid[j+2][i+2] * grid[j+3][i+3];
                    }
                }
            }
            
            for (int j = 0; j < n-3; j++) {
                for (int i = 0; i < 17-j; i++) {
                    if (grid[j][i] * grid[j+1][i+1] * grid[j+2][i+2] * grid[j+3][i+3] > max) {
                        max = grid[j][i] * grid[j+1][i+1] * grid[j+2][i+2] * grid[j+3][i+3];
                    }
                }
            }
            
            // diagonal  right-left
            for (int i = 3; i < n; i++) {
                for (int j = 0; j < i-2; j++) {
                    if (grid[i-j][j] * grid[i-1-j][j+1] * grid[i-2-j][j+2] * grid[i-3-j][j+3] > max) {
                        max = grid[i-j][j] * grid[i-1-j][j+1] * grid[i-2-j][j+2] * grid[i-3-j][j+3];
                    }
                }
            }
            
            for (int j = 0; j < n-3; j++) {
                for (int i = 0; i < 17-j; i++) {
                    if (grid[19-i][j+i] * grid[18-i][j+1+i] * grid[17-i][j+2+i] * grid[16-i][j+3+i] > max) {
                        max = grid[19-i][j+i] * grid[18-i][j+1+i] * grid[17-i][j+2+i] * grid[16-i][j+3+i];
                    }
                }
            }
            
            
            System.out.println(max);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
