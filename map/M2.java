package map;
import java.util.Map;
import java.util.HashMap;

public class M2{
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "= " + entry.getValue());
        }
    }
}
