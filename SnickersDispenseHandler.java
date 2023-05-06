public class SnickersDispenseHandler extends SnackDispenseHandler {

    public SnickersDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("snickers")) {
            System.out.println("Handling snickers dispense request");
        } else {
            System.out.println("I was passed from snickers");
            super.handleRequest(requestType);
        }
    }
    
}
