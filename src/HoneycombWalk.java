import java.util.Scanner;

public class HoneycombWalk {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases = scanner.nextInt();
		int numOfWalks, num = 0;

		for (int i = 0; i < numOfCases; i++) {
			numOfWalks = scanner.nextInt();
			num = 0;
			for (int j = 1; j <= numOfWalks / 2; j++) {
				num += j * 6;
			}
			System.out.println(num);
		}
	}
}
