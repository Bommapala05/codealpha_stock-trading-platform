import model.Portfolio;
import model.User;
import service.MarketService;
import ui.ConsoleUI;

public class Main {

    public static void main(String[] args) {

        User user = new User(
                1,
                "Manideep",
                50000
        );

        Portfolio portfolio =
                new Portfolio();

        MarketService marketService =
                new MarketService();

        ConsoleUI consoleUI =
                new ConsoleUI();

        consoleUI.showMenu();

        marketService.displayMarketStocks();

        portfolio.displayPortfolio();

        user.displayUser();
    }
}