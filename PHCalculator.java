public class PHCalculator {
    private double hIonConcentration;

    public PHCalculator(double hIonConcentration) {
        if (hIonConcentration <= 0) {
            throw new IllegalArgumentException("Hata: Derişim sıfırdan büyük olmalıdır!");
        }
        this.hIonConcentration = hIonConcentration;
    }

    public double calculatePH() {
        return -Math.log10(hIonConcentration);
    }
}
