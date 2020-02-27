import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  convexpolygonarea Convex Polygon Area
 * Link: https://open.kattis.com/problems/convexpolygonarea ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 12/11/2019
 * Method : formula for calculating the area of a convex polygon
 * Status : ACCEPTED
 * Runtime: 0.26s
 */
public class ConvexPolygonArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfConvexPolygons, numOfPoints;
		int[][] arrVertices;
		float num1, num2, result;

		numOfConvexPolygons = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < numOfConvexPolygons; i++) {
			numOfPoints = scanner.nextInt();
			arrVertices = new int[numOfPoints][2];

			for (int j = 0; j < numOfPoints; j++) {
				arrVertices[j][0] = scanner.nextInt();
				arrVertices[j][1] = scanner.nextInt();
			}

			num1 = num2 = 0;

//			Calculate area of a convex polygon
//			Area = 1/2 [ (x1*y2 + x2*y3 + x3*y4 + ... + xn*y1) - (y1*x2 + y2*x3 + y3*x4 + ... + yn*x1) ]


			for (int j = 0; j < numOfPoints - 1; j++) {                         // (x1*y2 + x2*y3 + x3*y4 + ... + xn*y1)			
				num1 += arrVertices[j][0] * arrVertices[j + 1][1];
			}
			num1 += arrVertices[arrVertices.length - 1][0] * arrVertices[0][1];

			for (int j = 0; j < numOfPoints - 1; j++) {                         // (y1*x2 + y2*x3 + y3*x4 + ... + yn*x1)
				num2 += arrVertices[j][1] * arrVertices[j + 1][0];
			}
			num2 += arrVertices[arrVertices.length - 1][1] * arrVertices[0][0];

			result = (num1 - num2) / 2;

			System.out.println(result);                                                // output: area of convex polygon
		}
	}
}
