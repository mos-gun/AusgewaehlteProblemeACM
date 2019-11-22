import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  acm ACM Contest Scoring
 * Link: https://open.kattis.com/problems/acm ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/21/2019
 * Method : HashMap
 * Status : ACCEPTED
 * Runtime: 0.17s
 */
class ACMContestScoring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lenOfList, totalPoints = 0, numOfCorrect = 0;
		int time;
		char letterOfProblem;
		boolean submissionCorrect;
		String line;
		ArrayList<String> listData = new ArrayList<>();
		HashMap<Character, Character> mapCorrectSubmissions = new HashMap<>();
		HashMap<Character, Character> mapIrrelevantSubmissions = new HashMap<>();

		while (true) {                                                                            // read all lines
			line = scanner.nextLine();
			if (line.equals("-1")) break;
			listData.add(line);
		}
		lenOfList = listData.size();

		for (int i = lenOfList - 1; i >= 0; i--) {                                              // iterate end to start
			Object[] arrObjects = listData.get(i).split(" ");
			time = Integer.parseInt(String.valueOf(arrObjects[0]));
			letterOfProblem = arrObjects[1].toString().charAt(0);
			if (String.valueOf(arrObjects[2]).startsWith("w")) submissionCorrect = false;
			else submissionCorrect = true;

			if (mapIrrelevantSubmissions.containsKey(letterOfProblem)) {                    // if problem never solved,
				continue;                                                                    // ignore
			}

			if (! mapCorrectSubmissions.containsKey(letterOfProblem)) {            // if problem is not in solved map
				if (submissionCorrect) {                                            // if problem solved
					mapCorrectSubmissions.put(letterOfProblem, null);                // add to map of correct problems
					totalPoints += time;                                            // add time to points
					numOfCorrect++;                                                    // increment num of right answers
				} else {                                                            // if problem not solved
					if (! mapIrrelevantSubmissions.containsKey(letterOfProblem)) {    // if problem not in irrelevant
						mapIrrelevantSubmissions.put(letterOfProblem, null);        // add to map of irrelevant problems
					}
				}
			} else {                                                                // if problem is in solved map
				totalPoints += 20;                                                    // add 20 penalty points
			}
		}
		System.out.println(numOfCorrect + " " + totalPoints);
	}
}