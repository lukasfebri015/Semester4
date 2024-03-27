package bangundatar;

public class SegitigaSembarang extends Segitiga {
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public SegitigaSembarang(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        super(alas, tinggi);
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public double getLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    @Override
    public double getKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}
