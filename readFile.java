// Thomas Huber 11/8/2017

import java.io.*;
import java.util.*;

public class readFile {

    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("F:/projects/CS/primeList.csv");
        BufferedReader br = new BufferedReader(in);
        String line;
        ArrayList<String> primes = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            primes.add(line);
        }
        for (String prime: primes) {
            System.out.println(prime);
        }
    }
}
