//string = immutable/poor performance when manipulating / thread safe cause its immutable
//String Builder allows string manipulation/good performance / not thread safe
//String buffer allows string manipulation/slower/thread safe
public class string {
    public static void main(String[] args) throws InterruptedException{
        String result = "";
        for(int i=0;i<10;i++){
            result = result + " Hello";
        }
        //this reassigns the string to previous text + new
        //cant directly change it cause string is immutable
        // also this is very performance bad and wastes resources

        StringBuilder sb= new StringBuilder("hello ");
        sb.append("hello").reverse();
        System.out.println(sb);
        String h=sb.toString();
        System.out.println(h);



        StringBuilder s = new StringBuilder();
        Task t1 = new Task(s);
        Task t2 = new Task(s);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("final length  : " + s.length());
    }
}
class Task extends Thread{
    private StringBuilder sb;
    public Task(StringBuilder sb){
        this.sb= sb;
    }
    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            sb.append("a");
        }
    }
}
//if we replace String Builder with String buffer it would work same