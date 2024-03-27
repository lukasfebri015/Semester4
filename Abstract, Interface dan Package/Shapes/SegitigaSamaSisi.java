package bangundatar;

public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double getKeliling() {
        return 3 * alas;
    }
}
