package sortingAdvanced;

import java.util.ArrayList;
import java.util.List;
//import java.util.Collections;



public class A1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("c");
        list.sort (String::compareTo);
        System.out.println(list);
    }
}
