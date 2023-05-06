public class DispensingSnackState implements StateOfVendingMachine {

    @Override
    public void selectSnack(String snackName, VendingMachine vendingMachine) {
        System.out.println("Please wait for your snack to be dispensed.");
    }

    @Override
    public void insertMoney(int money, VendingMachine vendingMachine) {
        System.out.println("Please wait for your snack to be dispensed.");
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        Snack selectedSnack = vendingMachine.getSelectedSnack();
        int insertedMoney = vendingMachine.getAmount();

        if (selectedSnack.getQuantity() > 0 && insertedMoney >= selectedSnack.getPrice()) {
            // Dispense the snack and update the vending machine state
            System.out.println("Dispensing " + selectedSnack.getName() + "...");
            selectedSnack.setQuantity(selectedSnack.getQuantity() - 1);
            int change = insertedMoney - selectedSnack.getPrice();
            vendingMachine.setAmount(0);
            vendingMachine.setChange(change);
            vendingMachine.setState(new IdleState());
        } else {
            // Return the money and update the vending machine state
            System.out.println("Not enough money or snack quantity. Returning money...");
            vendingMachine.setAmount(0);
            vendingMachine.setState(new WaitingForMoneyState());
        }
    }
}
