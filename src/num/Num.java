package num;
import java.util.ArrayList;
import java.util.Collections;

public class Num {
    public static void main(String[] args) {
        ArrayList <Integer> Num=new ArrayList <Integer>();
        Num.add(22);
        Num.add(25);
        Num.add(21);
        Num.add(23);
        Num.add(27);
        Num.add(24);
        Num.add(26);
        
        Collections.sort(Num);
        for(int i:Num){
           System.out.println(i);
        }
    }    
}
