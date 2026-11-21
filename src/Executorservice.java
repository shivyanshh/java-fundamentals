import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Basically you cant have a large number of threads , even if you make it
//it depends on your number of cores your cpu has. so if its 4 , then only 4 threads will work at same time
//no matter the number of thread created
public class Executorservice {
    //CPU intensive tasks = core count
    //IO intensive task = core count + bit more threads
    public static void main(String[] args){
        try{
            int coreCount = Runtime.getRuntime().availableProcessors();
            ExecutorService service = Executors.newFixedThreadPool(coreCount);
            for(int i = 0;i<10;i++){
                service.execute(new CPUintensive());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class CPUintensive implements Runnable{
    public void run(){
        //some CPU intensive tasks like cryptography etc.
        System.out.println("current thread : " +Thread.currentThread().getName());
    }
}
class IOintensive implements Runnable{
    public void run(){
        //some IO intensive tasks like waiting for OS response, http response etc.
        //if u have exact number of threads as CPU cores then
        //those threads will go in a waiting state
        //and have to wait for response but in reality
        //the task execution will stop while your fixed number of threads are waiting for a response
        //so u give a higher number of threads in fixed pool to overcome that
    }
}