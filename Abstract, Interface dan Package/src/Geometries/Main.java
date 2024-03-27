package Geometries;

public class Main {
    public static void main(String[] args) {
        // Kubus
        Kubus kubus = new Kubus(5);
        System.out.println("Kubus:");
        System.out.println("Volume: " + kubus.getVolume());
        System.out.println("Luas Permukaan: " + kubus.getLuasPermukaan());

        // Balok
        Balok balok = new Balok(4, 6, 8);
        System.out.println("\nBalok:");
        System.out.println("Volume: " + balok.getVolume());
        System.out.println("Luas Permukaan: " + balok.getLuasPermukaan());

        // Bola
        Bola bola = new Bola(3);
        System.out.println("\nBola:");
        System.out.println("Volume: " + bola.getVolume());
        System.out.println("Luas Permukaan: " + bola.getLuasPermukaan());

        // Tabung
        Tabung tabung = new Tabung(2, 5);
        System.out.println("\nTabung:");
        System.out.println("Volume: " + tabung.getVolume());
        System.out.println("Luas Permukaan: " + tabung.getLuasPermukaan());
    }
}