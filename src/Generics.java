//Generics in Java allow classes, interfaces, and methods to operate on parameterized data types (<T>) while guaranteeing
// compile-time type safety.
// Introduced in Java 5, generics let you write reusable code that works with different object types without losing type
// checking or needing manual type casting
public class Generics {
    public static void main(String[] args){
        // Usage with diamond operator (<>) for type inference
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        String text = stringBox.get(); // No casting needed

    }
}
//T is a placeholder for the type provided later
class Box<T> {
    private T content;

    public void set(T content) { this.content = content; }
    public T get() { return content; }
}