import java.util.*;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  quickbrownfox Quick Brown Fox
 * Link: https://open.kattis.com/problems/quickbrownfox ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/14/2019
 * Method : ascii table
 * Status : ACCEPTED
 * Runtime: 0.14s
 */
public class QuickBrownFox {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases;
		char[] arrInput;
		SortedMap<Character, Character> mapInput;
		StringBuilder sb;
		boolean isPangram;

		numOfCases = Integer.parseInt(scanner.nextLine().trim());

		for (int i = 0; i < numOfCases; i++) {
			mapInput = new TreeMap<>();
			sb = new StringBuilder("missing ");
			isPangram = true;
			arrInput = scanner.nextLine().toCharArray();

			for (char element : arrInput) {
				if (element >= 65 && element <= 90) {
					element += 32;
					mapInput.put(element, null);
				} else if (element >= 97 && element <= 122) {
					mapInput.put(element, null);
				}
			}
			for (char element = 'a'; element <= 'z'; element++) {
				if (! mapInput.containsKey(element)) {
					isPangram = false;
					sb.append(element);
				}
			}
			if (isPangram) System.out.println("pangram");
			else System.out.println(sb);
		}
	}
}