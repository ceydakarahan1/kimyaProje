import java.util.Scanner;

public class ChemicalMixtureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bileşen 1 ismi: ");
        String component1 = scanner.nextLine();
        System.out.print("Bileşen 1 yüzdesi (%): ");
        double percentage1 = scanner.nextDouble();

        System.out.print("Bileşen 2 ismi: ");
        scanner.nextLine();
        String component2 = scanner.nextLine();
        System.out.print("Bileşen 2 yüzdesi (%): ");
        double percentage2 = scanner.nextDouble();

        Mixture mixture = new Mixture(component1, percentage1, component2, percentage2);
        mixture.displayMixtureDetails();

        scanner.close();
    }
}
