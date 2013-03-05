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
public class Example3 {
    
    
    public static void main(String[] args) {
        Set<Dog> dogs = new HashSet<>();
    
        Dog dog1 = new Dog("Fido", "a");
        Dog dog2 = new Dog("Max", "b");
        Dog dog3 = new Dog("Fido", "a");
    
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        
        System.out.println(dogs.size());
    }
}
