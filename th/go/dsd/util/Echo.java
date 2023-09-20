package th.go.dsd.util;

public class Echo implements AppRunner{            // <-- original : public class Echo extends AppRunner{
    public String say(String arg){
        return arg;
    }

    @Override               // <-- Error with : public class Echo extends AppRunner{
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();
        switch(param.getSubCommand()){
            case "say" :
                if(param.getOption() != null){
                    String[] opts = param.getOption();
                    String result = "";
                    for(String o : opts){
                        result += say(o).concat(" ");
                    }
                    resp.setValue("Hello " + result);
                }
                break;
            default :
                break;
        }
        return resp;
    }
}
