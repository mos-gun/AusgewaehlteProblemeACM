import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  mirror Mirror Images
 * Link: https://open.kattis.com/problems/mirror ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/14/2019
 * Method : none
 * Status : ACCEPTED
 * Runtime: 0.22s
 */

public class MirrorImages {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases, numOfRows, numOfColumns;
		String[] rows;
		StringBuilder sb;

		numOfCases = scanner.nextInt();

		for (int i = 1; i <= numOfCases; i++) {
			numOfRows = scanner.nextInt();
			numOfColumns = scanner.nextInt();
			rows = new String[numOfRows];
			scanner.nextLine();
			
			for (int j = 0; j < numOfRows; j++) {
				rows[j] = scanner.nextLine();
			}
			System.out.println("Test " + i);
			for (int j = 1; j <= numOfRows; j++) {
				sb = new StringBuilder(rows[numOfRows - j]);
				System.out.println(sb.reverse());
			}
		}
	}
}
