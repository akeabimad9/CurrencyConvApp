package se.lexicon;


import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrencyConverter {
    // Predefined exchange rates
    double SEK_TO_USD = 0.091;
    double USD_TO_SEK = 11.0;
    double SEK_TO_EURO = 0.086;
    double EURO_TO_SEK = 11.63;
    // Convert SEK to USD
    public String convertSEKtoUSD(double sekAmount) {
        if (sekAmount <= 0) { return "Invalid amount!";
        }
        double result = sekAmount * SEK_TO_USD;
        return formatResult(sekAmount, "SEK", result, "USD");
    }
    // Convert USD to SEK
    public String convertUSDtoSEK(double usdAmount) {
        if (usdAmount <= 0) { return "Invalid amount!";
        }
        double result = usdAmount * USD_TO_SEK;
        return formatResult(usdAmount, "USD", result, "SEK");
    }
    // Convert SEK to Euro
    public String convertSEKtoEuro(double sekAmount) {
        if (sekAmount <= 0) { return "Invalid amount!";
        }
        double result = sekAmount * SEK_TO_EURO;
        return formatResult(sekAmount, "SEK", result, "Euro");
    }
    // Convert Euro to SEK
    public String convertEuroToSEK(double euroAmount) {
        if (euroAmount <= 0) { return "Invalid amount!";
        }
        double result = euroAmount * EURO_TO_SEK;
        return formatResult(euroAmount, "Euro", result, "SEK");
    }
    // Helper method to format output
    private String formatResult(double fromAmount, String fromCurrency, double toAmount, String toCurrency) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = sdf.format(new Date());
        return String.format("%.2f %s = %.2f %s (Converted on %s)", fromAmount, fromCurrency, toAmount, toCurrency, currentDateTime);
    }
}



