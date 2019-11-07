import java.util.Scanner;
import static java.lang.Math.*;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  howmanydigits How Many Digits?
 * Link: https://open.kattis.com/problems/howmanydigits ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/06/2019
 * Method : log
 * Status : ACCEPTED
 * Runtime: 0.41s
 */
public class HowManyDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 1000005, n;
		double[] arrDigits = new double[max];

		arrDigits[0] = 1.0;
		for (int i = 1; i < max; i++) {
			arrDigits[i] = arrDigits[i - 1] + log10(i);
		}

		while (scanner.hasNextInt()) {
			n = scanner.nextInt();
			System.out.println((int) arrDigits[n]);
		}
	}
}

/*
	public static void main(String[] args) {			//tLIMIT
		Scanner scanner = new Scanner(System.in);
		int input;
		double output;
		
		while (scanner.hasNext()) {
			input = scanner.nextInt();
			output = 0;
			for (int i = 1; i <= input; i++) {
				output += log10(i);
			}
			System.out.println((int) output + 1);
		}
	}
 */
