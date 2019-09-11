package components;


import behaviours.IParts;

public class Engine implements IParts {

    private int size;
    private EngineType type;

    public Engine(int size, EngineType type){
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }
}
