package utils;

import java.util.Random;

public class RandomPriceGenerator {

    public static double generateNewPrice(
            double currentPrice) {

        Random random = new Random();

        double percentageChange =
                (-5 + (10 * random.nextDouble()));

        double newPrice =
                currentPrice +
                (currentPrice *
                 percentageChange / 100);

        return Math.round(
                newPrice * 100.0
        ) / 100.0;
    }
}