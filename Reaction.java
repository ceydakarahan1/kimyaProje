public class Reaction {
    private double initialConcentration;
    private double rateConstant;

    public Reaction(double initialConcentration, double rateConstant) {
        this.initialConcentration = initialConcentration;
        this.rateConstant = rateConstant;
    }

    public double calculateConcentration(double time) {
        return initialConcentration * Math.exp(-rateConstant * time);
    }
}
