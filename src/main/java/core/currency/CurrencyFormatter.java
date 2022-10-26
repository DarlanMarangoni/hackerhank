package core.currency;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        try(var in = new Scanner(System.in)) {
            var payment = in.nextDouble();

            var us = NumberFormat.getCurrencyInstance(Locale.US);
            var india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            var china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            var france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            System.out.println("US: " + us.format(payment));
            System.out.println("India: " + india.format(payment));
            System.out.println("China: " + china.format(payment));
            System.out.println("France: " + france.format(payment));
        }
    }
}
