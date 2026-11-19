//Stream helps in doing operations in collections
//can only be used once
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class stream_api {
    public static void main(String[] args){
        List<Integer> num = Arrays.asList(41,2,36,1,50,6);

        num.stream()                                            //creates a new stream
                .filter(n->n%2==1)
                .map(n->n*2)                            //maps a new expression
                .sorted()                                       //sorts
                .forEach(n-> System.out.println(n));   //uses for each to print and then stream close
        //for each method we used a stream was created and close
        //in total we used stream,filter,map,sorted,foreach = 5 streams

//        Stream<Integer> data = num.stream();
//        Stream<Integer> coll = data.sorted();
//        Stream<Integer> arr = data.map(n->n*2);  //used for operations in stream
//        arr.forEach(n-> System.out.println("double:" + n));
//        coll.forEach(n-> System.out.println("sort:" + n));
//        System.out.println("sort ended");
//        long count = data.count();
//        System.out.println(count);
//        data.forEach(n -> System.out.println(n));
        //data.forEach(n-> System.out.println(n));
    }
}
