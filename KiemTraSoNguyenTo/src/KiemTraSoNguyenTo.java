import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        int i = 2;
        boolean check = true;
        int number;

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Nhập số bất kì: ");
        number = input.nextInt();

        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }

        if (check)
            System.out.println(number + " là số nguyên tố.");
        else
            System.out.println(number + " không phải số nguyên tố.");

    }
}
