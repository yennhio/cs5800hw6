public class SnackDispenseHandler {

    private SnackDispenseHandler next;

    public SnackDispenseHandler (SnackDispenseHandler next) {
        this.next = next;

    }

    public void handleRequest(String requestType) {
        if (next != null) {
            next.handleRequest(requestType);
        }
    }

} 
    

