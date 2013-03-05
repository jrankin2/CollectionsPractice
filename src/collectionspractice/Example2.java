/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionspractice;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jrankin2
 */
public class Example2 {
    public static void main(String[] args) {
        Set<String> gc = new HashSet<String>();
        gc.add("Beer");
        gc.add("Chips");
        gc.add("Wings");
        gc.add("Beer");
        
        System.out.println(gc.size());
        
        
        
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    
}
