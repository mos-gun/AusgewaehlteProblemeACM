//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class ACMContestScoring {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int numOfMinutes, numOfCorrect = 0, numOfPoints = 0;
//		char letterOfProblem;
//		String submissionResult;
//		ArrayList<ArrayList<String>> listSubmissions = new ArrayList<>();
//		ArrayList<String> listTempSubmission;
//		HashMap<String, String> mapMinutes = new HashMap<>();
//		HashMap<String, String> mapCorrectProblems = new HashMap<>();
//
//		while (true) {
//			numOfMinutes = scanner.nextInt();
//			if (numOfMinutes == - 1) break;
//			listTempSubmission = new ArrayList<>();
//			listTempSubmission.add(String.valueOf(numOfMinutes));
//			listTempSubmission.add(String.valueOf(scanner.next().charAt(0)));
//			listTempSubmission.add(scanner.nextLine().trim());
//			listSubmissions.add(listTempSubmission);
//		}
//		int lenListSubmissions = listSubmissions.size();
//
//		for (int i = 1; i <= lenListSubmissions; i++) {
//			if (! mapMinutes.containsKey(listSubmissions.get(lenListSubmissions - i).get(0))) {                             // if minutes slot not already used
//				if (! mapCorrectProblems.containsKey(listSubmissions.get(lenListSubmissions - i).get(1))) {                 // if problem not inside correct map
//					if (listSubmissions.get(lenListSubmissions - i).get(2).equals("right")) {                               // if submission is correct
//						numOfPoints += Integer.parseInt(listSubmissions.get(lenListSubmissions - i).get(0));                // add points to numOfPoints
//						mapMinutes.put(listSubmissions.get(lenListSubmissions - i).get(0), null);							// add points to mapMinutes
//						mapCorrectProblems.put(listSubmissions.get(lenListSubmissions-i).get(1), null);						// add right problem letter to mapCorrectProblems
//					} else {																								
//						numOfPoints += 20;																					// add 20 penalty points to total if minute slot free, problem not correct and submission wrong
//					}
//				} else {
//					
//				}
//			}
//		}
//
////		System.out.println(numOfCorrect + " " + numOfPoints);
//	}
//}
