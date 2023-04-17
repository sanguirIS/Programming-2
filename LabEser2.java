import java.util.Scanner;

public class LabEser2 {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;

    public void setItemName(String newItemName) {
        this.itemName = newItemName;
    }

    public void setTotalCost(int quantity, double price) {
        this.itemQuantity = quantity;
        this.itemPrice = price;
        this.amountDue = quantity * price;
    }

    public String getItemName() {
        return this.itemName;
    }

    public double getTotalCost() {
        return this.amountDue;
    }

    public void readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        this.itemName = sc.nextLine();
        System.out.print("Enter item price: ");
        this.itemPrice = sc.nextDouble();
        System.out.print("Enter item quantity: ");
        this.itemQuantity = sc.nextInt();
        sc.close();
        this.amountDue = this.itemQuantity * this.itemPrice;
    }

    public void writeOutput() {
        System.out.println("You are purchasing " + this.itemName + " at $" + this.itemPrice + " each.");
        System.out
                .println("Total cost for " + this.itemQuantity + " " + this.itemName + " is $" + this.amountDue + ".");
    }

    public static void main(String[] args) {
        LabEser2 purchase = new LabEser2();
        purchase.readInput();
        purchase.writeOutput();
    }
}
