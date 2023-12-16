import java.util.Scanner;

import utils.InfoPrint;

public class StringConverter {
    private final Scanner scan = new Scanner(System.in);
    private final InfoPrint printer = new InfoPrint();

    public String getMessageFromUser() {
	return scan.nextLine();
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
	scan.close();
    }
}
