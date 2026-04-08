import java.util.ArrayList;
import java.util.List;

public class homework6{
    public static void main(String[] args){
        List<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        System.out.println("Perinteinen for-silmukalla:");
        for(int i=0;i<List.size();i++){
        System.out.println(List.get(i));
        }
        System.out.println("for-each -silmukalla:");
        for(int l:List){
            System.out.println(l);
        }
    }
}