package collectionspractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        List<String> gc = new ArrayList<String>();
        gc.add("Beer");
        gc.add("Chips");
        gc.add("Wings");
        gc.add("Beer");
        
        String item = gc.get(0);
        for (Iterator<String> it = gc.iterator(); it.hasNext();) {
            String string = it.next();
            
        }
        
        
        
        
//        List<String> gc = new ArrayList<String>();
//        gc.add("Beer");
//        gc.add("Chips");
//        gc.add("Wings");
//        gc.add("Beer");
//        
//        String item = gc.get(0);
//        for (Iterator<String> it = gc.iterator(); it.hasNext();) {
//            String string = it.next();
//            
//        }
    }
}