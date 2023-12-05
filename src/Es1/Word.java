package Es1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int numberOfWord = 0;
      String word;

      while (numberOfWord <= 0){
          System.out.println("Insert the number of words you want!");
          try {
              numberOfWord = Integer.parseInt(input.nextLine());
          } catch (NumberFormatException ex){
              System.err.println("Please insert a number");
          }
      }

        LinkedHashSet<String> wordSet = new LinkedHashSet<>();
        ArrayList<String> duplicateSet = new ArrayList<>();
        for (int i = 0; i < numberOfWord ; i++) {
            System.out.println("Insert string number" + (i + 1));
            word = input.nextLine();
            if (!wordSet.add(word)){
                System.out.println(word + " already inserted!");
                duplicateSet.add(word);
            }
        }
        System.out.println("duplicate words: " + duplicateSet);
        System.out.println("There are: " + wordSet.size());
        System.out.println("this is the unique words: " + wordSet);

        input.close();
    }
}