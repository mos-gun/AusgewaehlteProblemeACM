import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  hittingtargets Hitting the Targets
 * Link: https://open.kattis.com/problems/hittingtargets ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 12/11/2019
 * Method : geometry, coordinate system calculation
 * Status : ACCEPTED
 * Runtime: 0.09s
 */
public class HittingTheTargets {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int numOfTargets, numOfShots, numOfHitTargets;
		String[] arrInput;
		int[] arrInputAsInt;
		ArrayList<int[]> listRectTargets = new ArrayList<>();
		ArrayList<int[]> listCircleTargets = new ArrayList<>();
		int[][] arrShotsCoordinates;

		numOfTargets = Integer.parseInt(in.readLine());

		for (int i = 0; i < numOfTargets; i++) {                           // store targets (rect/circle) in collections
			arrInput = in.readLine().split(" ");

			arrInputAsInt = new int[arrInput.length - 1];                     // minus 1 because of "rectangle"/"circle"
			for (int j = 1; j < arrInput.length; j++) {
				arrInputAsInt[j - 1] = Integer.parseInt(arrInput[j]);
			}

			if (arrInput[0].equals("rectangle")) {
				listRectTargets.add(arrInputAsInt);
			} else {
				listCircleTargets.add(arrInputAsInt);
			}
		}

		numOfShots = Integer.parseInt(in.readLine());
		arrShotsCoordinates = new int[numOfShots][2];

		for (int i = 0; i < numOfShots; i++) {                                 // store shots coordinates (x,y) in int[]
			arrInput = in.readLine().split(" ");
			arrShotsCoordinates[i][0] = Integer.parseInt(arrInput[0]);
			arrShotsCoordinates[i][1] = Integer.parseInt(arrInput[1]);
		}


		for (int i = 0; i < numOfShots; i++) {                                  // check shots for number of target hits
			numOfHitTargets = 0;

			for (int[] element : listCircleTargets) {               // check, in how many circle targets the shot landed
				int dX = arrShotsCoordinates[i][0] - element[0];
				int dY = arrShotsCoordinates[i][1] - element[1];
				if (dX * dX + dY * dY <= element[2] * element[2]) {
					numOfHitTargets++;
				}
			}

			for (int[] element : listRectTargets) {              // check, in how many rectangle targets the shot landed
				if (arrShotsCoordinates[i][0] >= element[0] &&
						arrShotsCoordinates[i][0] <= element[2] &&
						arrShotsCoordinates[i][1] >= element[1] &&
						arrShotsCoordinates[i][1] <= element[3]) {
					numOfHitTargets++;
				}
			}

			out.println(numOfHitTargets);
		}

		out.flush();
		out.close();
	}
}