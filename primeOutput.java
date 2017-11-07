// Thomas Huber 11/7/2017

import java.util.*;
import java.io.*;

public class primeOutput {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        boolean prime = true;

        PrintWriter pw = new PrintWriter(new File("primeList.csv"));
        StringBuilder sb = new StringBuilder();

        for (int i = 3; i < 50000; i+=2) {
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    prime = false;
                }
            }
            if (prime) {
                primes.add(i);
            }
            prime = true;
        }
        for (int h = 0; h < primes.size(); h++) {
            sb.append(primes.get(h));
            sb.append(',');
            if (h % 10 == 0) {
                sb.append('\n');
            }
        }
        pw.write(sb.toString());
        pw.close();
    }
}
