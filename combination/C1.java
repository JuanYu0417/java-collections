package combination;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C1 {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        List<String>names=new ArrayList<>();

        while(true){
            System.out.println("Enter student's name,or enter 'stop' to stop: " );
            String name=sc.nextLine();
            if (name.equalsIgnoreCase("stop")){
                break;
            }
            names.add(name);
        }
        System.out.println(names);
        sc.close();
    }
}
