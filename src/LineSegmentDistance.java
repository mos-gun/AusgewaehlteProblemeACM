import java.util.Scanner;

public class LineSegmentDistance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases;
		int[] arrCoordinates;

		numOfCases = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < numOfCases; i++) {
			arrCoordinates = new int[8];
			for (int j = 0; j < 8; j++) {                                            // read current coordinates set
				arrCoordinates[j] = scanner.nextInt();
			}

			// ask Logofatu: is the formula in the URL correct?
		}
	}
}
