public class WaitingForMoneyState implements StateOfVendingMachine {
    @Override
    public void selectSnack(String snackName, VendingMachine vendingMachine) {
        System.out.println("Please insert money.");
    }

    @Override
    public void insertMoney(int money, VendingMachine vendingMachine) {
        Snack selectedSnack = vendingMachine.getSelectedSnack();
        if (selectedSnack != null && money >= selectedSnack.getPrice()) {
            vendingMachine.setAmount(money);
            vendingMachine.setState(new DispensingSnackState());
            System.out.println("Money inserted: " + money);
        } else if (selectedSnack != null) {
            System.out.println("Please insert more money: " + selectedSnack.getPrice());
        } else {
            System.out.println("Please select a snack.");
        }
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Please insert money first.");
    }
}
