package th.go.dsd.util;

public class Truck extends Vehicle implements AppRunner{
    @Override
    public String getInfo() {
        return "Hino";
    }

    @Override
    public String sayHi() {
        return "Hi from my truck";
    }

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse(); // <-- 
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
