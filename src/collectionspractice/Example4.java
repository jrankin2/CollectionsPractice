/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionspractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example4 {
    
    
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
    
        Dog d1 = new Dog("Fido", "a");
        Dog d2 = new Dog("Max", "b");
        Dog d3 = new Dog("Fido", "a");
    
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        
        Set<Dog> dupes = new HashSet<Dog>(dogs);
        dogs = new ArrayList<Dog>(dupes);
    }
}
