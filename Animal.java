
package classnotes_10_30;

public abstract class Animal {
    
    private int age;
    private String color;
    
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
        display();
}
    
    public void display() {
        System.out.printf("I am %d year/years old, and my color is %s\n", age, color);
    }
    
    public abstract void speak();
}
