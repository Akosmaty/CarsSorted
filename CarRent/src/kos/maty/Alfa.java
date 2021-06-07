package kos.maty;

public class Alfa implements Cars {
    public  String model;
    public int engine;
    public String color;
    public  String outData;


    public Alfa(String model, int engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String getBrand() {
        return "AlfaRomeo";
    }

    public int getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
    public String toString(){
        return "\n" + "Alfa Romeo " + model + " "+ color + " " + engine ;
    }


}



