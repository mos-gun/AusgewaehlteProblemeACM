import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  happyprime Happy Happy Prime Prime
 * Link: https://open.kattis.com/problems/happyprime ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/06/2019
 * Method : sqr, sum of digits
 * Status : ACCEPTED
 * Runtime: 0.51s
 */
public class HappyHappyPrimePrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases, numOfDataSet, candidate, temp;
		boolean isHappyPrime = false;

		numOfCases = Integer.parseInt(scanner.nextLine().trim());
		for (int i = 1; i <= numOfCases; i++) {
			numOfDataSet = scanner.nextInt();
			candidate = scanner.nextInt();
			if (candidate % 2 == 0 || candidate == 1 || !isPrime(candidate)) isHappyPrime = false;
			else {
				temp = candidate;
				for (int j = 0; j < 10; j++) {
					temp = getSumOfSqrDigits(temp);
					if (temp == 1) {
						isHappyPrime = true;
						break;
					}
				}
			}
			if (isHappyPrime) System.out.println(numOfDataSet + " " + candidate + " YES");
			else System.out.println(numOfDataSet + " " + candidate + " NO");
		}
	}

	private static int getSumOfSqrDigits(int num) {                 // adapted version of standard sum of digits method
		int sum;
		for (sum = 0; num > 0; sum += Math.pow(num % 10, 2), num /= 10)
			;
		return sum;
	}

	private static boolean isPrime(int num) {
		if(num <=2) return false;
		for (int i = 2; i <= num / 2; i++) {
			if ((num % i) == 0)	return false;
		}
		return true;
	}
}