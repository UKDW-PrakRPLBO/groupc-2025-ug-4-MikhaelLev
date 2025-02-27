package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public void connect (Colokan colokan) {
        this.colokan = colokan;
        System.out.println("TV dengan colokan merk  " + colokan.getMerk());
    }

    public int getResolution(){
        double realBandwith = colokan.getRealBandwith();
        int resolution;

        if (realBandwith < 35){
            resolution = 480;
        } else if (realBandwith < 100){
            resolution = 720;
        } else {
            resolution = 1080;
        }

        return Math.min(resolution, maxResolusi);
    }
}
