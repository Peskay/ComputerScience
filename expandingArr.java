// Thomas huber 10/30/17

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class expandingArr {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program will tell you the frequency of numbers in an array of random numbers!");
		System.out.println("How many numbers would you like? (100 - 50000)");
		int inputs = sc.nextInt();
		ArrayList freq = new ArrayList();
		
		if (inputs < 100 || inputs > 50000) {
			return;
		} else {
			int[] numbers = new int [2 + inputs * 17];
			
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = ThreadLocalRandom.current().nextInt(0, 101);
				//freq.set(i, freq.get(i));
				System.out.println(freq);
			}
			System.out.println("Here are the frequencies\n" + freq);
		}
	}
}