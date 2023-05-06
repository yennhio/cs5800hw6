public class KitkatDispenseHandler extends SnackDispenseHandler {

    public KitkatDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("kitkat")) {
            System.out.println("Handling kitkat dispense request");
        } else {
            System.out.println("I was passed from kitkat");
            super.handleRequest(requestType);
        }
    }
    
}
