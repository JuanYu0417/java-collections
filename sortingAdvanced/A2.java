package sortingAdvanced;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;



public class A2 {
    public static void main(String[] args){
        List<String> list= new ArrayList<>();
        list.add("new");
        list.add("cloud");
        list.add("comperator");
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);


    }
    
}
