package org.example;

import org.example.utils.ConsoleConnector;
import org.example.utils.InfoPrinter;

import java.util.Scanner;

public class CaseConvertor {
    private final Scanner connect = ConsoleConnector.getConnect();
    private final InfoPrinter printer = new InfoPrinter();

    public String getMessageFromUser() {
        return connect.nextLine();
    }

    private String[] getSymbolsArray(String input) {
        return input.split("");
    }

    public String getStringFromSymbolsArray(String[] symbols) {
        return String.join("", symbols);
    }

    private void transformEvenCharsToUpperCase(String[] symbols) {
        for (int i = 0; i < symbols.length; i += 2) {
            symbols[i] = symbols[i].toUpperCase();
        }
    }

    private void transformOddCharsToLowerCase(String[] symbols) {
        for (int i = 1; i < symbols.length; i += 2) {
            symbols[i] = symbols[i].toLowerCase();
        }
    }


    public void startApp() {
        printer.getStartInfo();
        String input = getMessageFromUser();

        while (!input.equalsIgnoreCase("exit")) {
            String[] symbols = getSymbolsArray(input);
            transformOddCharsToLowerCase(symbols);
            transformEvenCharsToUpperCase(symbols);
            getStringFromSymbolsArray(symbols);
            input = getMessageFromUser();
        }
        ConsoleConnector.disConnect();
    }
}

