import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Snack> snacks = new ArrayList<>();
        snacks.add(new Snack("Coke", 25, 5));
        snacks.add(new Snack("Pepsi", 30, 3));
        snacks.add(new Snack("Cheetos", 20, 2));
        snacks.add(new Snack("Doritos", 15, 1));
        snacks.add(new Snack("KitKat", 35, 4));
        snacks.add(new Snack("Snickers", 40, 0));

        VendingMachine vendingMachine = new VendingMachine(snacks);

        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(20);
        vendingMachine.dispenseSnack();

        VendingMachine vendingMachine1 = new VendingMachine(snacks);

        vendingMachine1.selectSnack("Snickers");
        vendingMachine1.insertMoney(50);
        vendingMachine1.dispenseSnack();


        VendingMachine vendingMachine2 = new VendingMachine(snacks);

        vendingMachine2.selectSnack("Pepsi");
        vendingMachine2.insertMoney(50);
        vendingMachine2.dispenseSnack();
    }
}
