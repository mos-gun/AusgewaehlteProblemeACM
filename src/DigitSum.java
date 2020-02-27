//import java.util.Scanner;
//
///**
// * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
// * Problem:  digitsum Digit Sum
// * Link: https://open.kattis.com/problems/digitsum ;
// *
// * @author Mosgun Mahdere
// * @version 1.0, 12/09/2019
// * Method : none
// * Status : TRIED (Run Time Error)
// * Runtime: 0.14s (not final speed because of error)
// */
//public class DigitSum {
//	public static void main(String[] args) {
////		Scanner scanner = new Scanner(System.in);
////		int numOfCases, num1, num2, sum, lenOfSbNumbers;
////		StringBuilder sbNumbers;
////		int[] arrNumbers;
////
////		numOfCases = Integer.parseInt(scanner.nextLine());
////
////		for (int i = 0; i < numOfCases; i++) {
////			num1 = scanner.nextInt();
////			num2 = scanner.nextInt();
////			sum = 0;
////			sbNumbers = new StringBuilder();
////
////			for (int j = num1; j <= num2; j++) {
////				sbNumbers.append(j);
////			}
////			
////			
////
////			lenOfSbNumbers = sbNumbers.length();
////			for (int j = 0; j < lenOfSbNumbers; j++) {
////				sum += Integer.parseInt(String.valueOf(sbNumbers.charAt(j)));
////			}
////
////			System.out.println(sum);
////		}
//
//
//		Scanner scanner = new Scanner(System.in);
//		long numOfCases, num1, num2, sum;
//
//		numOfCases = Integer.parseInt(scanner.nextLine());
//
//		for (int i = 0; i < numOfCases; i++) {
//			num1 = scanner.nextInt();
//			num2 = scanner.nextInt();
//			sum = 0;
//
//			for (long j = num1; j <= num2; j++) {
//				sum += calcDigitSum(j);
//			}
//			System.out.println(sum);
//		}
//	}
//
//	private static int calcDigitSum(long num) {
//		int digitSum = 0;
//
//		while (num > 0) {
//			digitSum += num % 10;
//			num /= 10;
//		}
//		return digitSum;
//	}
//}