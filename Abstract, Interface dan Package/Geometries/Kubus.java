package Geometries;

import Shapes.Persegi;

public class Kubus implements Geometri {
    private Persegi alas;

    public Kubus(double sisi) {
        alas = new Persegi(sisi);
    }

    public double getVolume() {
        return alas.getLuas() * alas.getSisi();
    }

    public double getLuasPermukaan() {
        return 6 * alas.getLuas();
    }
}
