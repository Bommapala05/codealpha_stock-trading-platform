package service;

import model.Stock;

import java.util.ArrayList;

public class MarketService {

    private ArrayList<Stock> marketStocks;

    public MarketService() {

        marketStocks = new ArrayList<>();

        marketStocks.add(
                new Stock(
                        "TCS",
                        "Tata Consultancy Services",
                        3500,
                        100
                )
        );

        marketStocks.add(
                new Stock(
                        "INFY",
                        "Infosys",
                        1450,
                        150
                )
        );

        marketStocks.add(
                new Stock(
                        "RELIANCE",
                        "Reliance Industries",
                        2900,
                        80
                )
        );
    }

    public void displayMarketStocks() {

        System.out.println(
                "===== STOCK MARKET ====="
        );

        for (Stock stock : marketStocks) {

            stock.displayStock();

            System.out.println();
        }
    }
}