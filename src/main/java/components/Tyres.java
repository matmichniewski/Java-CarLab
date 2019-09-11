package components;

import behaviours.IParts;

public class Tyres implements IParts {

    private String make;
    private int size;

    public Tyres(String make, int size){
        this.make = make;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public int getSize() {
        return size;
    }
}
