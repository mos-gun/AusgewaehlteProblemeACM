//import java.util.Scanner;
//
///**
// * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
// * Problem:  beautifulprimes Beautiful Primes
// * Link: https://open.kattis.com/problems/beautifulprimes ;
// *
// * @author Mosgun Mahdere
// * @version 1.0, 11/06/2019
// * Method :
// * Status : to be submitted
// * Runtime: Unknown
// */
//public class BeautifulPrimes {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int numOfCases, numOfDigits;
//		int[] arrPrimes = fillArrayWithPrimes(1000);
//		int[] arrDigits;
//
//		if (isPrime(arrPrimes[0])) System.out.println("yes");
//		else System.out.println("no");
//
//		numOfCases = scanner.nextInt();
//
//		for (int i = 0; i < numOfCases; i++) {
//			numOfDigits = scanner.nextInt();
//			arrDigits = new int[numOfDigits];
//			for (int j = 0; j < numOfDigits; j++) {
//
//			}
//		}
//	}
//
//	private static boolean isPrime(int num) {
//		if (num <= 1) return false;
//		for (int i = 2; i <= num / 2; i++) {
//			System.out.println("check: " + num + " % " + i);
//			if ((num % i) == 0) return false;
//		}
//		return true;
//	}
//
//	private static int[] fillArrayWithPrimes(int amountOfPrimes) {
//		int[] arrPrimes = new int[amountOfPrimes];
//		int j = 0;
//
//		for (int i = 1; j < amountOfPrimes; i++) {
//			if (isPrime(i)) {
//				arrPrimes[j] = i;
//				j++;
//			}
//		}
//		return arrPrimes;
//	}
//
//	private static int getNumOfDigits(int num) {
//		int counter = 0;
//
//		while (num > 0) {
//			num /= 10;
//			counter++;
//		}
//		return counter;
//	}
//}
