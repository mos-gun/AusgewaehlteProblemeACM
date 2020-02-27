import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  maxcolinear Maximum Number of Colinear Points
 * Link: https://open.kattis.com/problems/maxcolinear ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 12/19/2019
 * Method : Colinear Points
 * Status : ACCEPTED
 * Runtime: 1.28s
 */
public class MaximumNumberOfColinearPoints {

	private static int[][] arrCoordinates;
	private static int numOfPoints;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result;

		while ((numOfPoints = scanner.nextInt()) != 0) {
			arrCoordinates = new int[numOfPoints][2];

			for (int i = 0; i < numOfPoints; i++) {
				arrCoordinates[i][0] = scanner.nextInt();
				arrCoordinates[i][1] = scanner.nextInt();
			}

//			if (numOfPoints == 1) result = 1;
//			else result = findMaxCollinearPoints();

//			System.out.println(result);

			if (numOfPoints == 1) result = 1;
			else result = findMaxCollinearPoints2();

			System.out.println(result);
		}
	}

	private static int findMaxCollinearPoints2() {
		HashMap<Double, Integer> mapOccurrences;
		int max = 0;
		int dx, dy;
		double quotient;

		for (int i = 0; i < numOfPoints; i++) {
			mapOccurrences = new HashMap<>();
			for (int j = 0; j < numOfPoints; j++) {
				if (i == j) continue;

				if (arrCoordinates[i][0] < arrCoordinates[j][0])
					dx = arrCoordinates[j][0] - arrCoordinates[i][0];
				else
					dx = arrCoordinates[i][0] - arrCoordinates[j][0];

				if (arrCoordinates[i][1] < arrCoordinates[j][1])
					dy = arrCoordinates[j][1] - arrCoordinates[i][1];
				else
					dy = arrCoordinates[i][1] - arrCoordinates[j][1];

				if (dy == 0) quotient = -1;
				else quotient = (double) dx / dy;

//				System.out.println(dx + " / " + dy + " = " + quotient);

				if (mapOccurrences.containsKey(quotient)) {
					mapOccurrences.put(quotient, mapOccurrences.get(quotient) + 1);
				} else mapOccurrences.put(quotient, 1);
				
				if(mapOccurrences.get(quotient) > max) max = mapOccurrences.get(quotient);
			}
//			System.out.println();
			
//			System.out.println(mapOccurrences);
			
		}
//		System.out.println(mapOccurrences);
		max += 1;
		return max;
	}

																							// FIRST TRY: TLE: O(n³)
	
//	private static boolean collinear(int x1, int y1, int x2, int y2, int x3, int y3) {
//		return (y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2);
//	}
//
//	private static int findMaxCollinearPoints() {
//		int best = 1;
//
//		for (int i = 0; i < numOfPoints; i++) {
//			for (int j = i + 1; j < numOfPoints; j++) {
//				int count = 2;
//				for (int k = j + 1; k < numOfPoints; k++) {
//
//					if (collinear(arrCoordinates[i][0], arrCoordinates[i][1],
//							arrCoordinates[j][0], arrCoordinates[j][1],
//							arrCoordinates[k][0], arrCoordinates[k][1])) {
//						count++;
//						System.out.println("i: " + i + "\nj: " + j + "\nk: " + k);
//						System.out.println("(" + arrCoordinates[i][0] + "," + arrCoordinates[i][1] + ") " +
//								"(" + arrCoordinates[j][0] + ", " + arrCoordinates[j][1] + ") " +
//								"(" + arrCoordinates[k][0] + ", " + arrCoordinates[k][1] + ") ");
//						System.out.println(count);
//					} else {
//						System.out.println("i: " + i + "\nj: " + j + "\nk: " + k);
//						System.out.println("(" + arrCoordinates[i][0] + "," + arrCoordinates[i][1] + ") " +
//								"(" + arrCoordinates[j][0] + ", " + arrCoordinates[j][1] + ") " +
//								"(" + arrCoordinates[k][0] + ", " + arrCoordinates[k][1] + ") ");
//						System.out.println("NOPE");
//					}
//				}
//				if (count > best) best = count;
//			}
//		}
//		return best;
//	}


}