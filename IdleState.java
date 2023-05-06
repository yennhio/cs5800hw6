public class IdleState implements StateOfVendingMachine {
    @Override
    public void selectSnack(String snackName, VendingMachine vendingMachine) {
        Snack snack = vendingMachine.getSnack(snackName);
        if (snack != null && snack.getQuantity() > 0) {
            vendingMachine.setSelectedSnack(snack);
            vendingMachine.setState(new WaitingForMoneyState());
            System.out.println("Snack selected: " + snack.getName());
        } else {
            System.out.println("Snack not available!");
        }
    }

    @Override
    public void insertMoney(int money, VendingMachine vendingMachine) {
        System.out.println("Please select a snack first.");
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Please select a snack and insert money first.");
    }
}
