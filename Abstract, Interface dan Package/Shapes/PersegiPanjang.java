package Shapes;

public class PersegiPanjang implements Shape {

    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    public double getPanjang() {
        return lebar;
    }

    public double getLebar() {
        return panjang;
    }
}