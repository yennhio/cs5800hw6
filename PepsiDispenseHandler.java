public class PepsiDispenseHandler extends SnackDispenseHandler {

    public PepsiDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("pepsi")) {
            System.out.println("Handling pepsi dispense request");
        } else {
            System.out.println("I was passed from pepsi");
            super.handleRequest(requestType);
        }
    }
    
}
