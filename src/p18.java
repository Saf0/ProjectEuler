import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    

    public class p18 {
     
       public static void main(String[] args) {
         
            Scanner sc;
            try {
                sc = new Scanner(new File("p18.txt"));
                
                int[][] p = new int[100][100];
                
                for(int i = 0; i < 100; i++) {
                       
                    for (int j = 0; j <= i; j++) {
                            p[j][i] = sc.nextInt();
                    }
               
                }
         
                for(int i = 98; i >= 0; i--) {
                       
                    for (int j = 0; j <= i; j++) {
                            int l = p[j][i] + p[j][i+1];
                            int r = p[j][i] + p[j+1][i+1];
                            p[j][i] = Math.max(l, r);
                    }
               
                }
         
                System.out.println(p[0][0]);
                
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
       }
     
    }

