package bangundatar;

public class SegitigaSikuSiku extends Segitiga {
    private double siku;

    public SegitigaSikuSiku(double alas, double tinggi, double siku) {
        super(alas, tinggi);
        this.siku = siku;
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double getKeliling() {
        return alas + tinggi + siku;
    }
}
