package combination;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class C4 {
    public static void main(String[] args){
       System.out.println("Enter a sentence: ");
       Map<String,Integer> word=new HashMap<>();
       Scanner sc= new Scanner(System.in);
       String sentence=sc.nextLine();
       String[]words=sentence.split("\\s+");

       for(String w:words){
        String lowCaseWords = w.toLowerCase().replaceAll("[^a-z]","");
           word.put(lowCaseWords, word.getOrDefault(lowCaseWords, 0) + 1);
       }
       System.out.println(word + ", " + words.length);
       sc.close();
    }

}
