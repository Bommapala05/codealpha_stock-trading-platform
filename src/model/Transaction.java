package model;

public class Transaction {

    private String stockSymbol;
    private int quantity;
    private double price;
    private String transactionType;

    public Transaction(String stockSymbol,
                       int quantity,
                       double price,
                       String transactionType) {

        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
        this.transactionType = transactionType;
    }

    public void displayTransaction() {

        System.out.println("Type : " + transactionType);
        System.out.println("Stock : " + stockSymbol);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : ₹" + price);
    }
}