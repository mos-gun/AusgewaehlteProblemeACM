import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  juryjeopardy Jury Jeopardy
 * Link: https://open.kattis.com/problems/juryjeopardy ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/23/2019
 * Method : none
 * Status : ACCEPTED
 * Runtime: 0.31s
 */
public class JuryJeopardy {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int numOfCases, numOfSteps;
		int maxX, maxY, minX, minY;                                                 // upper,lower,left,right most bound
		int rows, cols;                                                   // rows,cols: right, upper and lower most wall 
		char[][] arrField;                                                                                 // maze field
		char[] inputMovement;                                                     // input (which steps have been taken)
		int[][] arrStepsCoordinates;                                               // x,y coordinates of positions taken
		char direction;                                                     // direction, maze runner is looking towards

		numOfCases = Integer.parseInt(in.readLine());
		out.println(numOfCases);                                                         // output: number of test cases

		for (int i = 0; i < numOfCases; i++) {                                                   // go through all cases
			inputMovement = in.readLine().toCharArray();                                        // read input (movement)
			numOfSteps = inputMovement.length;                                                      // count taken steps
			arrStepsCoordinates = new int[numOfSteps + 1][2];
			direction = 'e';                                                       // initialize direction with e (east)
			rows = cols = maxX = maxY = minX = minY = 0;                                        // initialize all with 0
			for (int j = 0; j < numOfSteps; j++) {
				direction = nextMove(direction, inputMovement[j]);    // get next position to move towards and store x,y
				if (direction == 'e') {
					arrStepsCoordinates[j + 1][0] = arrStepsCoordinates[j][0];
					arrStepsCoordinates[j + 1][1] = arrStepsCoordinates[j][1] + 1;

				} else if (direction == 'w') {
					arrStepsCoordinates[j + 1][0] = arrStepsCoordinates[j][0];
					arrStepsCoordinates[j + 1][1] = arrStepsCoordinates[j][1] - 1;

				} else if (direction == 'n') {
					arrStepsCoordinates[j + 1][0] = arrStepsCoordinates[j][0] - 1;
					arrStepsCoordinates[j + 1][1] = arrStepsCoordinates[j][1];

				} else if (direction == 's') {
					arrStepsCoordinates[j + 1][0] = arrStepsCoordinates[j][0] + 1;
					arrStepsCoordinates[j + 1][1] = arrStepsCoordinates[j][1];

				}
			}

			for (int j = 0; j < numOfSteps + 1; j++) {                // get upper, lower, left and right bound for maze
				if (arrStepsCoordinates[j][0] > maxY) maxY = arrStepsCoordinates[j][0];                   // lower bound
				if (arrStepsCoordinates[j][0] < minY) minY = arrStepsCoordinates[j][0];                   // upper bound
				if (arrStepsCoordinates[j][1] > maxX) maxX = arrStepsCoordinates[j][1];                   // right bound
				if (arrStepsCoordinates[j][1] < minX) minX = arrStepsCoordinates[j][1];                    // left bound
			}
			rows = - minY + maxY + 3;                          // calc rows: add 3 to rows for walls+entrance row buffer
			cols = - minX + maxX + 2;                                       // calc cols: add 2 to cols for walls buffer

			arrField = new char[rows][cols];                                            // create maze with perfect size
			for (int j = 0; j < rows; j++) {                                       // set all coordinates of maze to '#'
				for (int k = 0; k < cols; k++) {
					arrField[j][k] = '#';
				}
			}

			for (int j = 0; j < numOfSteps + 1; j++) {                  // adjust saved positions to maze entrance point
				arrStepsCoordinates[j][0] += - minY + 1;       // add upper bound(minY) + 1 (wall) for correct entry pos
				arrStepsCoordinates[j][1] += minX;                         // add left bound(minX) for correct entry pos
			}

			for (int j = 0; j < numOfSteps + 1; j++) {                                           // mark all pos in maze
				arrField[arrStepsCoordinates[j][0]][arrStepsCoordinates[j][1]] = '.';
			}

			out.println(rows + " " + cols);                                               // output: number of rows,cols

			for (int j = 0; j < rows; j++) {                                                             // output: maze
				for (int k = 0; k < cols; k++) {
					out.print(arrField[j][k]);
				}
				out.println();
			}
		}
		out.flush();
		out.close();
	}


	private static char nextMove(char direction, char step) {                // function for returning next step to take
		char nextMove = '#';

		if (step == 'F') {
			if (direction == 'e') nextMove = 'e';
			if (direction == 'w') nextMove = 'w';
			if (direction == 'n') nextMove = 'n';
			if (direction == 's') nextMove = 's';

		} else if (step == 'B') {
			if (direction == 'e') nextMove = 'w';
			if (direction == 'w') nextMove = 'e';
			if (direction == 'n') nextMove = 's';
			if (direction == 's') nextMove = 'n';

		} else if (step == 'L') {
			if (direction == 'e') nextMove = 'n';
			if (direction == 'w') nextMove = 's';
			if (direction == 'n') nextMove = 'w';
			if (direction == 's') nextMove = 'e';

		} else if (step == 'R') {
			if (direction == 'e') nextMove = 's';
			if (direction == 'w') nextMove = 'n';
			if (direction == 'n') nextMove = 'e';
			if (direction == 's') nextMove = 'w';

		}

		return nextMove;
	}
}