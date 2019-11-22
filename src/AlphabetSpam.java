import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  alphabetspam Alphabet Spam
 * Link: https://open.kattis.com/problems/alphabetspam ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/14/2019
 * Method : ascii table
 * Status : ACCEPTED
 * Runtime: 0.21s
 */
public class AlphabetSpam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int inputLen = input.length();
		char[] arrInput = input.toCharArray();
		int numOfWhitespaces = 0, numOfLowercaseLetters = 0, numOfUppercaseLetters = 0, numOfSymbols = 0, sum = 0;

		for (int i = 0; i < inputLen; i++) {
			if (arrInput[i] == 95) numOfWhitespaces++;
			else if (arrInput[i] >= 97 && arrInput[i] <= 122) numOfLowercaseLetters++;
			else if (arrInput[i] >= 65 && arrInput[i] <= 90) numOfUppercaseLetters++;
			else numOfSymbols++;

			sum++;
		}
		System.out.println((double) numOfWhitespaces / sum);
		System.out.println((double) numOfLowercaseLetters / sum);
		System.out.println((double) numOfUppercaseLetters / sum);
		System.out.println((double) numOfSymbols / sum);
	}
}
