
package classnotes_10_30;

import java.util.ArrayList;

public class ClassNotes_10_30 {

    public static void main(String[] args) {
        Dog dog = new Dog(12, "brown");
        Fish fish = new Fish(1, "blue");
        Lion lion = new Lion(22, "Black");
        
        ArrayList<Animal> Alist = new ArrayList<Animal>();
        Alist.add(lion);
        Alist.add(fish);
        Alist.add(dog);
        
        for(int i=0; i<Alist.size(); i++) {
            allSpeak(Alist.get(i));
        }
    }
//    
//    public static void DogSpeak(Dog dog) {
//        dog.speak();
//    }
//    
//    public static void FishSpeak(Fish fish) {
//        fish.speak();
//    }
//    
//    public static void LionSpeak(Lion lion) {
//        lion.speak();
//   }
    
    public static void allSpeak(Animal animal) {
        animal.speak();
    }
}
