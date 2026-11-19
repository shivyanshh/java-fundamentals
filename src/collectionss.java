import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//Collections give readymade datastructure to use in java which are efficient than to write from scratch
public class collectionss {
    public static void main(String[] args){
        //HashSet contains non-duplicated values , not thread safe requires externally , no order maintained
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(50);
        h.add(20);
        System.out.println("set : "+ h);

        //ArrayList contains duplicated value, not thread safe , ordered
        ArrayList<Integer> A= new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(50);
        A.add(20);
        System.out.println("array:" + A);

        //HashMap contains Unique Keys & Duplicated values , not thread safe , no order
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(2,"hello");
        hm.put(1,"sashi buri dana, Mugiwaraaaa!!");
        System.out.println(hm.get(1));
    }
}
