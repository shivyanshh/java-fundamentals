// implements Runnable vs extends Thread
//we cant extend more than one class
//we can implement multiple class so implement runnable is better
public class Threading implements Runnable{
    private int Threadnumber;
    public Threading(int Threadnumber){
        this.Threadnumber =Threadnumber;
    }
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println(i + " thread number " + Threadnumber);
            if(Threadnumber==2){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args){
        for(int i = 0;i<5;i++) {
            Threading obj = new Threading(i);
            Thread myThread = new Thread(obj);
            myThread.start();
            //Threading obj2 = new Threading();
            //obj.start();
            //obj2.start();


            //used to join threads basically waiting for one thread to complete
            //and executing the next
//            try{
//                myThread.join();
//            }
//            catch (InterruptedException e){
//            }

        }
    }
}
