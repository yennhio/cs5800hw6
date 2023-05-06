public class CheetosDispenseHandler extends SnackDispenseHandler {

    public CheetosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("cheetos")) {
            System.out.println("Handling cheetos dispense request");
        } else {
            System.out.println("I was passed from cheetos");
            super.handleRequest(requestType);
        }
    }
    
}
