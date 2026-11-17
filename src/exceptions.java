import java.io.FileReader;
import java.io.IOException;

//syntax error
//logical error
//runtime error
public class exceptions {
    public static void main(String[] args) throws IOException {
        int[] a = {100,20,30,40};
        int[] b ={10,2,0};
        arithmetic obj = new arithmetic();
        obj.divide(a,b);


        //FileReader fileread = new FileReader();  this is checked exceptions cant run without try-catch
        //or throws statement at void main
        //java.io.FileReader fileReader = new FileReader("a.txt");



        //try with resources
        try(java.io.FileReader fileReader = new FileReader("a.txt");){
            //this will automatically close the resource since File reader is implements autoclossable
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
class arithmetic{
    void divide(int a[] , int b[]){
        for(int i=0;i<a.length;i++) {
            try {
                int j=0;
                System.out.println(a[i] / b[i]);

            }
            catch (ArithmeticException e){
                System.out.println("problem : " + e);
            }
            catch (NullPointerException e){
                System.out.println("problem : "+ e);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("problem : " + e);
            }
//            catch (InsufficientFunds e){
//                System.out.println(e);
//            }
            catch(Exception e) {
                System.out.println("problem : " + e);
            }
            finally {
                System.out.println("yo bbg!!!");
            }
        }
    }
}

//custom exceptions
class InsufficientFunds extends Exception{
    public  InsufficientFunds(){
        super("what do you want? you dont have money!");
    }
}