import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.printf("Nhập cân nặng(kg):");
        weight = scanner.nextDouble();

        System.out.printf("Nhập chiều cao(m):");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s", "Chỉ số bmi", "Trạng thái\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Gầy");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Cân đối");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}
