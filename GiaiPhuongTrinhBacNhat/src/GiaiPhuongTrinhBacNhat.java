import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Line Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants: ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextFloat();

        System.out.print("b: ");
        double b = scanner.nextFloat();

        System.out.print("c: ");
        double c = scanner.nextFloat();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass width x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
