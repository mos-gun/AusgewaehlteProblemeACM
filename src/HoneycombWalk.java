import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  honey Honeycomb Walk
 * Link: https://open.kattis.com/problems/honey ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 12/11/2019
 * Method : complex formula, I had to research (in method: honeycomb_walk)
 * Status : ACCEPTED
 * Runtime: 0.13s
 */
public class HoneycombWalk {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases;
		long[] walks = new long[15];

		walks[0] = 1;
		walks[1] = 0;
		walks[2] = 6;

		for (int i = 3; i < 15; i++) {
			walks[i] = - 1;
		}

		numOfCases = scanner.nextInt();

		for (int i = 0; i < numOfCases; i++) {
			int path;
			path = scanner.nextInt();
			System.out.println(honeycomb_walk(path,walks));
		}
	}

	private static long honeycomb_walk(int n, long[] walks) {									// researched formula
		if (walks[n] < 0) {
			walks[n - 3] = honeycomb_walk(n - 3, walks);
			walks[n - 2] = honeycomb_walk(n - 2, walks);
			walks[n - 1] = honeycomb_walk(n - 1, walks);
			walks[n] = (walks[n - 1] * n + 24 * walks[n - 2] * n + 36 * walks[n - 3] * n - 24 * walks[n - 2] - 72 * walks[n - 3]) * (n - 1) / (n * n);
		}
		return walks[n];
	}
}