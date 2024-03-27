package Shapes;

public class SegitigaSamaKaki implements Shape {

    private double alas;
    private double tinggi;
    private double sisi;

    public SegitigaSamaKaki(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return alas + 2 * sisi;
    }
}