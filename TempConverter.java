// Thomas Huber 9/12/17

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TempConverter {

	public static double toCel(double inFahr) {
        double outCel = (0.5555555556 * (inFahr - 32));

        outCel = BigDecimal.valueOf(outCel)
            .setScale(3, RoundingMode.HALF_UP)
            .doubleValue();
            
        return outCel;
    }

    public static double toFahr(double inCel) {
        double outFahr = (1.8 * inCel + 32);

        outFahr = BigDecimal.valueOf(outFahr)
            .setScale(3, RoundingMode.HALF_UP)
            .doubleValue();

        return outFahr;
    }

	public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter f to convert from celsius to fahrenheit or c to convert the other way");
        String choice = sc.nextLine();

        if (choice.equals("c")) {
             System.out.println("Enter the degrees in Fahrenheit");
             double inFahr = sc.nextDouble();
             System.out.println(toCel(inFahr));

        } else if (choice.equals("f")) {
            System.out.println("Enter the degrees in Celsius");
            double inCel = sc.nextDouble();
            System.out.println(toFahr(inCel));
        } else {
            System.out.println("wow good job you don't know how to type");
            System.exit(0);
        }
	}
}