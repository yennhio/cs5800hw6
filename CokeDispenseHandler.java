public class CokeDispenseHandler extends SnackDispenseHandler {

    public CokeDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("coke")) {
            System.out.println("Handling coke dispense request");
        } else {
            System.out.println("I was passed from coke");
            super.handleRequest(requestType);
        }
    }
    
}
