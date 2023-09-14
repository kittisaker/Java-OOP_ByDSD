package th.go.dsd.util;

public class Car extends Vehicle {
    private String modelName = "Mustang";

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String brand() {             // <--
        return this.brand;
    }

    public void honk(){
        super.honk();
        System.out.println("Beep Beep !!");
    }
}
