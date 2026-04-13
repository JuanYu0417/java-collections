package map;
import java.util.Map;
import java.util.HashMap;

public class M3{
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "punainen");
        map.put(2, "sininen");
        for(Integer key:map.keySet()){
            System.out.print(key+" ");
        }
    }
}