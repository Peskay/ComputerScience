// Dice
// Thomas Huber 12/4/2017

import java.util.Random;

public class dice {

		int num;

		public static int roll (int incLim) {
			Random rand = new Random();
			return rand.nextInt(incLim) + 1;
		}

		public static int getValue () {
			return roll(6);
		}

		public static void main (String[] args) {
			System.out.println("THIS IS A FUN GAME, WE WILL ROLL A DICE UNTIL YOU GET A THREE!");

			int theNum = getValue();
			int tries = 0;
			int gradedTries = 0;
			String score = "";

			System.out.println("\n");
			while (theNum != 3) {
				System.out.println(theNum);
				theNum = getValue();
				tries++;
				gradedTries++;
			}
			System.out.println("\n3\n");

			if (gradedTries > 6) {
				gradedTries = 6;
			}

			switch (gradedTries) {
				case 0:
					score = "PERFECT";
					break;
				case 1:
					score = "REALLY GOOD";
					break;
				case 2:
					score = "REALLY GOOD";
					break;
				case 3:
					score = "GOOD";
					break;
				case 4:
					score = "OKAY";
					break;
				case 5:
					score = "BAD";
					break;
				case 6:
					score = "COMPLETE GARBAGE";
					break;

			}

			System.out.println("WOW YOU DID IT AFTER " + tries + " TRIES, THAT'S " + score + "!");
		}
}
