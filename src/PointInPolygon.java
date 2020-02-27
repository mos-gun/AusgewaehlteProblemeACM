import java.awt.*;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  pointinpolygon Point in Polygon
 * Link: https://open.kattis.com/problems/pointinpolygon ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 12/19/2019
 * Method : polygon area, vertices calculation
 * Status : TRIED (Wrong Answer)
 * Runtime: 0.40s (not final speed because of error)
 */
public class PointInPolygon {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfVertices, numOfTestPoints, testPointX, testPointY, result;
		int[] arrPolygonVerticesX;                                                // x axis coordinates array of polygon
		int[] arrPolygonVerticesY;                                                // y axis coordinates array of polygon
		Polygon polygon;
		boolean isOnPolygon;

		while ((numOfVertices = scanner.nextInt()) != 0) {
			arrPolygonVerticesX = new int[numOfVertices];                 // set x axis array size to number of vertices
			arrPolygonVerticesY = new int[numOfVertices];                 // set y axis array size to number of vertices
			for (int i = 0; i < numOfVertices; i++) {                          // loop for storing vertices inside array
				arrPolygonVerticesX[i] = scanner.nextInt();                              // store x coordinate of vertex
				arrPolygonVerticesY[i] = scanner.nextInt();                              // store y coordinate of vertex
			}

			polygon = new Polygon(arrPolygonVerticesX, arrPolygonVerticesY, numOfVertices);            // create polygon

			numOfTestPoints = scanner.nextInt();                                        // read number of points to test
			for (int i = 0; i < numOfTestPoints; i++) {                            // loop for testing points and output

				testPointX = scanner.nextInt();                                           // read test point coordinates
				testPointY = scanner.nextInt();

				isOnPolygon = false;

				for (int j = 1; j < numOfVertices; j++) {					// loop for checking, if point is on segment
					// Point p0: segment point 1
					Point a = new Point(arrPolygonVerticesX[j - 1], arrPolygonVerticesY[j - 1]);
					// Point p1: segment point 2
					Point b = new Point(arrPolygonVerticesX[j], arrPolygonVerticesY[j]);
					// Point p2: test point
					Point c = new Point(testPointX, testPointY);

					// check, if test point is on the polygon
//					result = (b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y);				// works
//					if (result == 0) {
//						isOnPolygon = true;
//						break;
//					}

//					if (isPointOnSegment(a, b, c)) {				// doesnt work
//						isOnPolygon = true;
//						break;
//					}

					if (isOn(a, b, c)) {							// works but wrong answer
						isOnPolygon = true;
						break;
					}


				}
				if (isOnPolygon) System.out.println("on");
				else if (polygon.contains(testPointX, testPointY)) System.out.println("in");
				else System.out.println("out");
			}
		}
	}

	private static boolean isPointOnSegment(Point s1, Point s2, Point p) {
		int d, num1, num2;
		num1 = (p.x * s1.x) + (p.y - s1.y);
		num2 = (p.x * s2.x) + (p.y * s2.y);
		d = num1 * num2;
		if (d <= 0) {
			return pow(abs(d), 2) == (pow(abs(num1), 2) * pow(abs(num2), 2));
		}
		return false;
	}

	private static boolean isOn(Point a, Point b, Point c) {
		double distanceAC = calcDistance(a, c);
		double distanceBC = calcDistance(b, c);
		double distanceAB = calcDistance(a, b);

		return (distanceAC + distanceBC) <= distanceAB;
	}

	private static double calcDistance(Point p1, Point p2) {
		return sqrt(pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2));
	}

}