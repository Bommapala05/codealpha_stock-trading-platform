package model;

public class User {

    private int userId;
    private String userName;
    private double walletBalance;

    public User(int userId,
                String userName,
                double walletBalance) {

        this.userId = userId;
        this.userName = userName;
        this.walletBalance = walletBalance;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public void displayUser() {

        System.out.println("User ID : " + userId);
        System.out.println("User Name : " + userName);
        System.out.println("Wallet Balance : ₹" + walletBalance);
    }
}