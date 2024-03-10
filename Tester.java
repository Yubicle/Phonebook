import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        while (num >= 10)
            num /= 10;
        System.out.println("The first 2 digits are: " + (int)num);
    }
}
