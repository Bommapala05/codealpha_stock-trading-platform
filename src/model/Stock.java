package model;

public class Stock {

    private String stockSymbol;
    private String companyName;
    private double stockPrice;
    private int availableQuantity;

    public Stock(String stockSymbol,
                 String companyName,
                 double stockPrice,
                 int availableQuantity) {

        this.stockSymbol = stockSymbol;
        this.companyName = companyName;
        this.stockPrice = stockPrice;
        this.availableQuantity = availableQuantity;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void displayStock() {

        System.out.println("Stock Symbol : " + stockSymbol);
        System.out.println("Company Name : " + companyName);
        System.out.println("Stock Price  : ₹" + stockPrice);
        System.out.println("Available Qty: " + availableQuantity);
    }
}