public interface StateOfVendingMachine {
    void selectSnack(String snackName, VendingMachine vendingMachine);
    void insertMoney(int money, VendingMachine vendingMachine);
    void dispenseSnack(VendingMachine vendingMachine);
}
