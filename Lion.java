
package classnotes_10_30;

public class Lion extends Animal {
    public Lion(int age, String color) {
        super(age, color);
    }
    
    @Override
    public void speak() {
        System.out.println("I roar!");
    }
}
