package Shapes;

public class Persegi implements Shape {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getSisi() {
        return sisi;
    }
}
