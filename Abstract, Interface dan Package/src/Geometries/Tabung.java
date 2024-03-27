package Geometries;

import Shapes.Lingkaran;

public class Tabung implements Geometri {
    private Lingkaran alas;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        alas = new Lingkaran(jariJari);
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return alas.getLuas() * tinggi;
    }

    public double getLuasPermukaan() {
        return 2 * alas.getLuas() + alas.getKeliling() * tinggi;
    }
}