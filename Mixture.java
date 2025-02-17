public class Mixture {
    private String component1;
    private double percentage1;
    private String component2;
    private double percentage2;

    public Mixture(String component1, double percentage1, String component2, double percentage2) {
        if (percentage1 + percentage2 != 100) {
            throw new IllegalArgumentException("Hata: Yüzdelerin toplamı 100 olmalıdır!");
        }
        this.component1 = component1;
        this.percentage1 = percentage1;
        this.component2 = component2;
        this.percentage2 = percentage2;
    }

    public void displayMixtureDetails() {
        System.out.println("Kimyasal Karışım Oluşturuldu:");
        System.out.println(component1 + ": " + percentage1 + "%");
        System.out.println(component2 + ": " + percentage2 + "%");
    }
}
