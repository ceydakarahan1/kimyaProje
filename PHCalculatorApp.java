import java.util.Scanner;

public class PHCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("H+ iyon derişimini girin (mol/L): ");
        double concentration = scanner.nextDouble();

        PHCalculator calculator = new PHCalculator(concentration);
        System.out.printf("Hesaplanan pH değeri: %.2f\n", calculator.calculatePH());

        scanner.close();
    }
}
