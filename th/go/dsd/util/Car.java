package th.go.dsd.util;

public class Car extends Vehicle implements AppRunner{
    private String modelName = "Mustang";

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String brand() {           
        return this.brand;
    }

    public void honk(){
        super.honk();
        System.out.println("Beep Beep !!");
    }

    public String getInfo(){        // <--
        return this.modelName;
    }

    public String sayHi(){
        return "Hello";
    }

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();     // <-- 
        switch(param.getSubCommand()){
            case "info" :
                resp.setValue(getInfo());
                break;
            default :
                break;
        }
        return resp;
    }
}
