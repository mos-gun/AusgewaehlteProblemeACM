import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  factovisors Factovisors
 * Link: https://open.kattis.com/problems/factovisors ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 02/02/2020
 * Method : none
 * Status : ACCEPTED
 * Runtime: 0.21s
 */
public class Factovisors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, tmp, counter;

		next:
		while (scanner.hasNext()) {
			x = scanner.nextInt();
			y = scanner.nextInt();

			if (y == 0) {
				System.out.println(y + " does not divide " + x + "!");
				continue;
			}

			if (y == 1 || y <= x) {
				System.out.println(y + " divides " + x + "!");
				continue;
			}

			tmp = y;
			counter = 0;

			for (int i = 2; i <= (int) Math.ceil(Math.sqrt(y)); i++) {
				while (y % i == 0) {
					y /= i;
					counter++;
				}

				if (counter > 0) {
					for (int j = i; j <= x; j *= i) counter -= x / j;

					if (counter > 0) {
						System.out.println(tmp + " does not divide " + x + "!");
						continue next;
					}
				}
				counter = 0;
			}
			if (y <= x) System.out.println(tmp + " divides " + x + "!");
			else System.out.println(tmp + " does not divide " + x + "!");
		}
	}
}