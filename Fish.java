
package classnotes_10_30;

public class Fish extends Animal {
    public Fish(int age, String color) {
        super(age, color);
    }
    
    @Override
    public void speak() {
        System.out.println("I make bubbles");
    }
}
