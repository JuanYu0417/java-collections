import java.util.ArrayList;
import java.util.List;

public class homework4{
    public static void main(String[] args){
        List<String> letterList = new ArrayList<>();
        letterList.add("A");
        letterList.add("B");
        letterList.add("C");
        letterList.remove(1);
        // letterList.remove("B");// remove(index) is very fast,because it just need to move the index,but remove(object)need to find the object.
        System.out.println(letterList);
    }
}