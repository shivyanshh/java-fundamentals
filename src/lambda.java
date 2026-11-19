//When having an interface class with one method
//We can use lambda expression to simplify
public class lambda {
    public static void main(String[] args){
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("yooii");
//            }
//        };

        A obj = (i) -> System.out.println("in show " + i);
        obj.show(3);
    }
}
interface A{
    public void show(int i);
}
