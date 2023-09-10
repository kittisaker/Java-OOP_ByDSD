package th.go.dsd.util;

public class Car extends Vehicle{
    private String modelName = "Mustang";   // <--

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // public String getBrand(){        // <--
    //     return this.brand;
    // }

    public void hook(){
        // super.hook();
        System.out.println("Car Beep Beep!");
    }   
    
}
