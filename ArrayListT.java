// Thomas Huber 11/1/2017

import java.util.*;

public class ArrayListT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean done = false;
        String nextWord = "";
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type in items you'll have for Thanksgiving, when you're done type 'stop'");

        while (!nextWord.equals("stop")) {
            nextWord = sc.nextLine();
                if (!nextWord.equals("stop")) {
                    words.add(nextWord);
                }
        }

        System.out.println('\n');

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
