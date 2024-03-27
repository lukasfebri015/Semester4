package Shapes;

public class App {
    public static void main(String[] args) {
        // Persegi
        Persegi persegi = new Persegi(5);
        System.out.println("Persegi:");
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());

        // Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        System.out.println("\nPersegi Panjang:");
        System.out.println("Luas: " + persegiPanjang.getLuas());
        System.out.println("Keliling: " + persegiPanjang.getKeliling());

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(3);
        System.out.println("\nLingkaran:");
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());

        // Segitiga Sama Kaki
        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(5, 4, 6);
        System.out.println("\nSegitiga Sama Kaki:");
        System.out.println("Luas: " + segitigaSamaKaki.getLuas());
        System.out.println("Keliling: " + segitigaSamaKaki.getKeliling());
    }
}