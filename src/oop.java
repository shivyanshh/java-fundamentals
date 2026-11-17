public class oop {
    public static void main(String[] args){
        vehicle obj = new car();
        obj.engine_run();

        child obj1 = new child();
        obj1.concern();
    }
}
interface vehicle{
    final int a = 10;
    void engine_run();
}
class car implements vehicle{
    public void engine_run(){
        System.out.println("my car goes vroom  vroom!!!");
    }
}
class parent{
    void concern(){
        System.out.println("be safe while driving!!!");
    }
}
class child extends parent{
    @Override       //this is for safety purpose incase i do a typo in method name
    void concern(){
        System.out.println("just chilling!");
    }
}