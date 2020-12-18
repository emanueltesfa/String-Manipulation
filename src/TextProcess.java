import java.util.ArrayList;
import java.util.StringTokenizer;

public class TextProcess {
	static String input = "Man i hate this device i purchased from amazon its broken (904)657-3136";
	static String stopList = " i an and we Hello name  orange  ";
	// return "my is"

	public TextProcess(String input, String stopList) {
		super();
		this.input = input;
		this.stopList = stopList;
	}

	public static String reverse(String input) {

		StringBuilder stringBuilder = new StringBuilder("");

		for (int i = (input.length() - 1); i >= 0; --i) {
			stringBuilder.append(String.valueOf(input.charAt(i)));
		}
		System.out.println("this is after reverse : " + stringBuilder);

		return stringBuilder.toString();
		// returns a reversed order version of input
	}

	public String toLowerCase() {
		input = toLowerCase().toLowerCase();
		return input;
		// returns an all-lower-case version of input
	}

	public String toUpperCase() {
		input = toUpperCase().toUpperCase();
		return input;
		// returns an all-upper-case version of input
	}

	public static String[] tokens(String input) {

		String[] token = input.split(" ");

		return token;
		// returns an array of the words of input

	}

	public static String removeNoise(String input, String stl) {
		StringBuilder finalLiString = new StringBuilder("");
		input = "Hello my nAme is EMANUeL".toLowerCase();
		stl = "Not hello name hi Ema orange".toLowerCase();

		ArrayList<String> inputList = new ArrayList<>();
		String[] token = input.split(" ");
		for (int i = 0; i < token.length; i++) {
			inputList.add(token[i]);
		}

		ArrayList<String> stopList = new ArrayList<>();
		String[] token1 = stl.split(" ");

		for (int i = 0; i < token1.length; i++) {
			stopList.add(token1[i]);

		}

		for (int i = 0; (i < inputList.size() && (i < stopList.size())); i++) {

			if (inputList.contains(token[i]) && !(stopList.contains(token[i]))) { // lets check if first token from
				finalLiString.append(token[i]).append(" ");

			}

		}

		System.out.println("FINAL LIST ***" + finalLiString);

		return input;
		// returns a modified version of input after
		// removing all the words from stopList
	}

	public static String[] phones(String input) {
		input.toLowerCase();

		String[] phoneNumber = tokens(input);
		String[] finalNum = new String[1];

		for (int i = 0; i < phoneNumber.length; i++) {

			if (phoneNumber[i].matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")) {
				String numString = phoneNumber[i];

				if (numString.charAt(0) == ('(') && (numString.charAt(1) == '9') && (numString.charAt(2) == '0')
						&& (numString.charAt(3) == '4') && (numString.charAt(4) == ')')) {
					
					for (int j = 0; j < finalNum.length; j++) {
						finalNum[j] = numString;
					}
				}

			}

		}
		for (int i = 0; i < finalNum.length; i++) {
			System.out.print(finalNum[i]);
		}

		return phoneNumber;
		// returns the list of phone numbers following the
		// (xxx)xxx-xxxx in input where each x is a single-digit
	}

	public static void main(String args[]) {

		TextProcess textProcess = new TextProcess(input, stopList);
		reverse(input);
		tokens(" hello, this, is, assignemnt 7");
		removeNoise(input, stopList);
		phones(input);
	}

}
