package org.example;

public abstract class Colokan {
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Colokan(String merk, double promisedBandwith, int harga) {
        this.merk = merk;
        this.promisedBandwith = promisedBandwith;
        this.harga = harga;
    }

    public double getPromisedBandwith() {
        return promisedBandwith;
    }

    public void setPromisedBandwith(double promisedBandwith) {
        this.promisedBandwith = promisedBandwith;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    private String merk;
    private double promisedBandwith;
    private int harga;


    public abstract double getRealBandwith();
}


