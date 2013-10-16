import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class p22 extends EulerProblem {

    public static void main(String[] args) {

        EulerProblem e = new p22();
        e.computeResult();
        e.showResult();
        
    }
    
    @Override
    public void computeResult() {
        
        ArrayList<String> list = new ArrayList<String>();
        
        try {
            
            this.sc = new Scanner(new File("p22.txt"));
            String content = "";
            
            while (sc.hasNextLine()) {
                content += sc.nextLine();
            }
            
            String[] names = content.split(",");
            
            for (int i = 0; i < names.length; i++) {
                list.add(names[i].substring(1, names[i].length()-1));
            }
            
            Collections.sort(list);
            
            int sum = 0;
            int i = 1;
            
            for (String name : list) {
                sum += getNameValue(name) * i;
                i++;
            }
            
            this.result = sum + "";
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
    public int getNameValue(String name) {
        
        int val = 0;
        
        for (int i = 0; i < name.length(); i++) {
            val += name.codePointAt(i) - 64;
        }
        
        return val;
        
    }

}
