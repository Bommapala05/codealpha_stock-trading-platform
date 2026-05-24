package model;

import java.util.HashMap;

public class Portfolio {

    private HashMap<String, Integer> ownedStocks;

    public Portfolio() {
        ownedStocks = new HashMap<>();
    }

    public void addStock(String stockSymbol,
                         int quantity) {

        if (ownedStocks.containsKey(stockSymbol)) {

            int oldQuantity =
                    ownedStocks.get(stockSymbol);

            ownedStocks.put(stockSymbol,
                    oldQuantity + quantity);

        } else {

            ownedStocks.put(stockSymbol,
                    quantity);
        }
    }

    public void displayPortfolio() {

        System.out.println("===== PORTFOLIO =====");

        if (ownedStocks.isEmpty()) {

            System.out.println(
                    "No Stocks Purchased Yet!"
            );

            return;
        }

        for (String stock :
                ownedStocks.keySet()) {

            System.out.println(
                    stock + " -> " +
                    ownedStocks.get(stock) +
                    " shares"
            );
        }
    }
}