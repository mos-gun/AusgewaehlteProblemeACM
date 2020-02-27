//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//
//public class LongestIncreasingSubsequence {
//
//	private static int[] arrSequence;
//	private static int lenOfSequence = 0;
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter out = new PrintWriter(System.out);
//		String input;
//		String[] arrStringSequence;
//		ArrayList<Integer> listSubsequence;
//
//		while ((input = in.readLine()) != null) {
//			lenOfSequence = Integer.parseInt(input);
//			out.println("lenOfSequence: " + lenOfSequence);
//			arrStringSequence = in.readLine().split(" ");
//			for (String element : arrStringSequence) {
//				out.print(element + " ");
//			}
//			out.println();
//			arrSequence = new int[lenOfSequence];
//			for (int i = 0; i < lenOfSequence; i++) {
//				arrSequence[i] = Integer.parseInt(arrStringSequence[i]);
//				out.println("inserted num: " + arrSequence[i]);
//			}
//
//			for (int i = 0; i < lenOfSequence; i++) {
//				listSubsequence = findSubsequence(i);
//				out.println(listSubsequence);
//				out.println();
//				System.out.println("================================================================");
//			}
//		}
//		out.flush();
//		out.close();
//	}
//
//	private static ArrayList<Integer> findSubsequence(int beginIndex) {
//		for (int element : arrSequence) {
//			System.out.print(element + " ");
//		}
//		System.out.println();
//
//		ArrayList<Integer> listSubsequence = new ArrayList<>();
//		int smallerNum = arrSequence[beginIndex];
//		System.out.println("smallerNum: " + smallerNum);
//
//		listSubsequence.add(smallerNum);
//		for (int i = beginIndex + 1; i < lenOfSequence; i++) {
//			System.out.println("if " + arrSequence[i] + " > " + smallerNum);
//			if (arrSequence[i] > smallerNum) {
//				listSubsequence.add(arrSequence[i]);
//				System.out.println("Added int to subsequence: " + arrSequence[i]);
//				System.out.print("elements of current subsequence: ");
//				for (int element : listSubsequence) {
//					System.out.print(element + " ");
//				}
//				System.out.println();
//				smallerNum = arrSequence[i];
//			}
//		}
//
//		return listSubsequence;
//	}
//}
