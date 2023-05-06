public class DoritosDispenseHandler extends SnackDispenseHandler {

    public DoritosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("doritos")) {
            System.out.println("Handling doritos dispense request");
        } else {
            System.out.println("I was passed from doritos");
            super.handleRequest(requestType);
        }
    }
    
}
