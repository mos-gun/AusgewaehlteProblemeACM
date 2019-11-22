import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  mixedfractions Mixed Fractions
 * Link: https://open.kattis.com/problems/mixedfractions ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/14/2019
 * Method : mod (%)
 * Status : ACCEPTED
 * Runtime: 0.28s
 */
public class MixedFractions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numerator = - 1;
		int denominator = - 1;

		while (true) {
			numerator = scanner.nextInt();
			denominator = scanner.nextInt();
			if (numerator == 0 && denominator == 0) break;
			
			System.out.print(numerator / denominator + " " + numerator % denominator + " / " + denominator + "\n");
		}
	}
}