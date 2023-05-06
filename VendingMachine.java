import java.util.List;

public class VendingMachine {
    private StateOfVendingMachine state;
    private SnackDispenseHandler snackDispenseHandler;
    private List<Snack> snacks;
    private Snack selectedSnack;
    private int amount, change;

    public VendingMachine(List<Snack> snacks) {
        this.state = new IdleState();
        this.snackDispenseHandler = buildSnackDispenseChain();
        this.snacks = snacks;
    }

    private SnackDispenseHandler buildSnackDispenseChain() {
        SnackDispenseHandler snickersHandler = new SnickersDispenseHandler(null);
        SnackDispenseHandler kitkatHandler = new KitkatDispenseHandler(snickersHandler);
        SnackDispenseHandler doritosHandler = new DoritosDispenseHandler(kitkatHandler);
        SnackDispenseHandler cheetosHandler = new CheetosDispenseHandler(doritosHandler);
        SnackDispenseHandler pepsiHandler = new PepsiDispenseHandler(cheetosHandler);
        SnackDispenseHandler cokeHandler = new CokeDispenseHandler(pepsiHandler);


        return cokeHandler;
    }

    public Snack getSnack(String name) {
        for (Snack snack : snacks) {
            if (snack.getName().equalsIgnoreCase(name)) {
                return snack;
            }
        }
        return null;
    }

    public void selectSnack(String snackName) {
        state.selectSnack(snackName, this);
    }

    public void insertMoney(int money) {
        state.insertMoney(money, this);
    }

    public void dispenseSnack() {
        snackDispenseHandler.handleRequest(selectedSnack.getName().toLowerCase());
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public SnackDispenseHandler getSnackDispenseHandler() {
        return snackDispenseHandler;
    }

    public void setSelectedSnack(Snack selectedSnack) {
        this.selectedSnack = selectedSnack;
    }

    public Snack getSelectedSnack() {
        return selectedSnack;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setChange(int change) {
        this.change = change;
    }
}
