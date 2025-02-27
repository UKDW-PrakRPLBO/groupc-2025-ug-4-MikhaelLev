package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwith, String merk) {
        super(merk, promisedBandwith, harga);
    }

    @Override
    public double getRealBandwith() {
        int hargaNormal = 30000;
        int harga = super.getHarga();
        double ratio = harga / (double) hargaNormal > 1?1:harga / (double) hargaNormal;
        return super.getPromisedBandwith() * ratio;
    }
}
