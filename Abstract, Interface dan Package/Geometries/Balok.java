package Geometries;

import Shapes.PersegiPanjang;

public class Balok implements Geometri {
    private PersegiPanjang alas;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        alas = new PersegiPanjang(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return alas.getLuas() * tinggi;
    }

    public double getLuasPermukaan() {
        double luasAlas = alas.getLuas();
        double luasDepanBelakang = alas.getPanjang() * tinggi;
        double luasSamping = alas.getLebar() * tinggi;
        return 2 * (luasAlas + luasDepanBelakang + luasSamping);
    }
}
