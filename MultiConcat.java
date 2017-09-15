import java.util.Scanner;
public class MultiConcat {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What string would you like to concatenate? ");
        String in = sc.nextLine();
        System.out.println("How many times would you like to concatenate? ");
        int times = sc.nextInt();
        if (times < 2) {
            System.out.println("Values less than 2 are changed to 2 ");
            times = 2;
        } 
        for (int i = 0; i < times; i++) {
            System.out.print(in);
        }
    }
}