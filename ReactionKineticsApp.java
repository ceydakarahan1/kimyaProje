import java.util.Scanner;

public class ReactionKineticsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Başlangıç konsantrasyonunu girin (mol/L): ");
        double initialConcentration = scanner.nextDouble();
        System.out.print("Reaksiyon hız sabitini girin (1/s): ");
        double rateConstant = scanner.nextDouble();
        System.out.print("Geçen süreyi girin (saniye): ");
        double time = scanner.nextDouble();

        Reaction reaction = new Reaction(initialConcentration, rateConstant);
        System.out.printf("Zaman %s s sonra konsantrasyon: %.4f mol/L\n", time, reaction.calculateConcentration(time));

        scanner.close();
    }
}
