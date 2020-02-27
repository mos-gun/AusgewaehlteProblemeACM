import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  stickysituation Sticky Situation
 * Link: https://open.kattis.com/problems/stickysituation ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 12/05/2019
 * Method : not originally mine
 * Status : ACCEPTED
 * Runtime: 0.36s
 */
public class StickySituation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));

		int n = sc.nextInt();
		long[] sticks = new long[n];
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = sc.nextLong();
		}

		Arrays.sort(sticks);

		for (int i = 0; i < sticks.length - 2; i++) {
			if (sticks[i] + sticks[i + 1] > sticks[i + 2]) {
				System.out.println("possible");
				return;
			}
		}
		System.out.println("impossible");
	}
}

																	// MY FIRST SOLUTION

//import java.util.*;
//
//public class StickySituation {
//
//	private static long[] arrSticks;
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int numOfSticks;
//		boolean isPossible = false;
//
//		numOfSticks = Integer.parseInt(scanner.nextLine());
//		arrSticks = new long[numOfSticks];
//
//		for (int i = 0; i < numOfSticks; i++) {
//			arrSticks[i] = scanner.nextInt();
//		}
//
//		Arrays.sort(arrSticks);
//
//		int lenOfArrSticks = arrSticks.length;
//
//		for (int i = 0; i < lenOfArrSticks - 2; i++) {
//			if (arrSticks[i] + arrSticks[i + 1] > arrSticks[i + 2]) {
//				System.out.println("possible");
//				return;
//			}
//		}
//
//		System.out.println("impossible");
//
////		isPossible = checkSticks();
//
////		if (isPossible) System.out.println("possible");
////		else System.out.println("impossible");
//	}
//
////	private static boolean checkSticks() {
////		int lenOfArrSticks = arrSticks.length;
////
////		for (int i = 0; i < lenOfArrSticks - 2; i++) {
////			if (arrSticks[i] + arrSticks[i + 1] > arrSticks[i + 2]) {
////				return true;
////			}
////		}
////		return false;
////	}
//}