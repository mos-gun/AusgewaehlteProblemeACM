import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  measurement Imperial Measurement
 * Link: https://open.kattis.com/problems/measurement ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/22/2019
 * Method : none
 * Status : ACCEPTED
 * Runtime: 0.13s
 */
public class ImperialMeasurement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num, thouFactor1 = 0, thouFactor2 = 0;
		String fromUnit, toUnit;
		String[] arrInput;
		String[][] arrUnits = {
				{"th", "thou", "1"},
				{"in", "inch", "1000"},
				{"ft", "foot", "12000"},
				{"yd", "yard", "36000"},
				{"ch", "chain", "792000"},
				{"fur", "furlong", "7920000"},
				{"mi", "mile", "63360000"},
				{"lea", "league", "190080000"},
		};
		arrInput = scanner.nextLine().split(" ");
		num = Integer.parseInt(arrInput[0]);
		fromUnit = arrInput[1];
		toUnit = arrInput[3];

		for (int i = 0; i < 8; i++) {
			if (fromUnit.equals(arrUnits[i][0]) || fromUnit.equals(arrUnits[i][1])) {
				thouFactor1 = Long.parseLong(arrUnits[i][2]);
			}
			if (toUnit.equals(arrUnits[i][0]) || toUnit.equals(arrUnits[i][1])) {
				thouFactor2 = Long.parseLong(arrUnits[i][2]);
			}
		}
		if (thouFactor1 >= thouFactor2) System.out.println((num * thouFactor1) / thouFactor2);
		else {
			System.out.printf("%.15f", (double)(num*thouFactor1)/thouFactor2);
		}
	}
}