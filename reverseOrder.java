// Thomas Huber 11/9/2017

import java.util.*;

public class reverseOrder {

    public static ArrayList<String> reverse(ArrayList<String> al) {
        ArrayList<String> reversed = new ArrayList<String>();

        for (int i = al.size()-1; i > -1; i--) {
            reversed.add(al.get(i));
        }

        return reversed;
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("1");
        al.add("2");
        al.add("3");

        System.out.println("\nOriginal ArrayList");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        al = reverse(al);

        System.out.println("\nNew ArrayList");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
