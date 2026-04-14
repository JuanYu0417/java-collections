package combination;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C2 {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Set<String>word=new HashSet<>();

        while(true){
            System.out.println("Enter a word ,or enter 'stop' to stop: " );
            String words=sc.nextLine();
            if (words.equalsIgnoreCase("stop")){
                break;
            }
            word.add(words);
        }
        System.out.println(word);
        System.out.println("The number of unique words is: "+word.size());
        sc.close();

     }
}
