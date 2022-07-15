package mx.com.hittechs.animals.test;

import java.util.ArrayList;
import mx.com.hittechs.animals.Animal;
import mx.com.hittechs.animals.Cat;
import mx.com.hittechs.animals.Dog;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class AnimalsTest {
    
    public static void feed(Animal a){
        a.eat();
    }  
   
    
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        //feed(cat);
        //feed(dog);
        
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
        
        for (Animal a : animals) {
            a.eat();
        }
           
    }
}
