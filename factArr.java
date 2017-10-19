// Thomas Huber 10/19/17

import java.util.*;

public class factArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] facts = new double[20];

        for (int i = 1; i <= 20; i++) {
            int f = 1;
            for (int x = 1; x <= i; x++) {
                f *= x;
            }
            facts[i-1] = f;
        }
        System.out.println("\nNumbers will overflow after 13!\n");
        for (int i = 0; i < 20; i++) {
                System.out.println(i+1 + "! = " + facts[i]);
        }
    }
}
