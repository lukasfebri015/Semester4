package Geometries;

import Shapes.Lingkaran;

public class Bola implements Geometri {
    private Lingkaran lingkaran;

    public Bola(double jariJari) {
        lingkaran = new Lingkaran(jariJari);
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(lingkaran.getJariJari(), 3);
    }

    public double getLuasPermukaan() {
        return 4 * Math.PI * Math.pow(lingkaran.getJariJari(), 2);
    }
}
