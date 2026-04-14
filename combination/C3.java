package combination;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C3 {
    public static void main(String[] args){
        Map<String,String>person=new HashMap<>();
        person.put("Anna","044-123456");
        person.put("Mekko","040-883456");
        person.put("Liisa","050-123776");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a name: " );
        String name=sc.nextLine();
        if(person.containsKey(name)){
            System.out.println("Phone number for " + name + " is: " + person.get(name));
        } else {
            System.out.println("Name not found.");
        }
        sc.close();

     }
}
