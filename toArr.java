// Thomas Huber 10/19/17

import java.util.Scanner;

public class toArr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        double newNum;
        String newName;

        double[] nums = new double[10];
        String[] names = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number you would like to add to the array");
            newNum = sc.nextDouble();
            nums[i] = newNum;

            System.out.println("Enter the letter name of the number");
            newName = sc.nextLine();
            newName = sc.nextLine();
            names[i] = newName;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println('\n');
            System.out.println(nums[i]);
            System.out.println(names[i]);
        }
    }
}
