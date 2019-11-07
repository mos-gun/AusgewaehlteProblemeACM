//import java.util.*;
//
///**
// * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
// * Problem:  goldbach2 Goldbach's Conjecture
// * Link: https://open.kattis.com/problems/goldbach2 ;
// *
// * @author Mosgun Mahdere
// * @version 1.0, 11/07/2019
// * Method :
// * Status : WRONG ANSWER								WRONG ANSWER AT SECOND TESTCASE
// * Runtime: Unknown
// */
//public class GoldbachsConjecture {
//
//	private static LinkedHashMap<Integer, Integer> mapPrimes = primes(32000);
//	private static Integer[] arrPrimes = mapPrimes.keySet().toArray(new Integer[mapPrimes.size()]);
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int numOfCases, num, upperBoundPrimeNumber, sum, counter;
//		StringBuilder sb;
//
//		numOfCases = scanner.nextInt();
//
//		for (int i = 0; i < numOfCases; i++) {
//			num = scanner.nextInt();
//			counter = 0;
//			sb = new StringBuilder();
//
//			if (num == 4) System.out.println("4 has 1 representation(s)\n2+2\n");
//			else {
//				upperBoundPrimeNumber = getNextSmallestPrime(num);
//				int posUpperBoundPrime = mapPrimes.get(upperBoundPrimeNumber);
//
//				for (int posLowerBoundPrime = 1; posLowerBoundPrime < arrPrimes.length / 2; ) {
//					if (posUpperBoundPrime < posLowerBoundPrime) break;
//					sum = arrPrimes[posLowerBoundPrime] + arrPrimes[posUpperBoundPrime];
//					if (sum == num) {
//						counter++;
//						sb.append(arrPrimes[posLowerBoundPrime]).append("+").append(arrPrimes[posUpperBoundPrime]).append("\n");
//						posLowerBoundPrime++;
//						posUpperBoundPrime--;
//					} else if (sum < num) {
//						posLowerBoundPrime++;
//					} else {
//						posUpperBoundPrime--;
//					}
//				}
//
//				System.out.println(num + " has " + counter + " representation(s)");
//				System.out.println(sb.toString());
//			}
//		}
//
//	}
//
//	private static LinkedHashMap<Integer, Integer> primes(int n) {
//		LinkedHashMap<Integer, Integer> mapPrimes = new LinkedHashMap<>();
//		boolean[] primes = new boolean[n + 1];
//		for (int i = 2; i < primes.length; i++) {
//			primes[i] = true;
//		}
//		int num = 2;
//		while (true) {
//			for (int i = 2; ; i++) {                                            // set all multiples of num to false
//				int multiple = num * i;                                        // (multiples of num cant be primes)
//				if (multiple > n) {                                            // only search until num > n/2
//					break;                                                    // because multiple will be over n
//				} else {
//					primes[multiple] = false;
//				}
//			}
//			boolean nextNumFound = false;
//			for (int i = num + 1; i < n + 1; i++) {                            // search for next biggest prime
//				if (primes[i]) {                                            // repeat until all multiples set to false
//					num = i;                                                // 
//					nextNumFound = true;
//					break;
//				}
//			}
//			if (! nextNumFound) {
//				break;
//			}
//		}
//		for (int i = 0, j = 0; i < primes.length; i++) {
//			if (primes[i]) {
//				mapPrimes.put(i, j);
//				j++;
//			}
//		}
//		return mapPrimes;
//	}
//
//	private static int getNextSmallestPrime(int num) {                // works only for even num
//		num -= 1;
//		while (num > 1) {
//			if (mapPrimes.containsKey(num)) {
//				return num;
//			} else num -= 2;
//		}
//		return - 1;
//	}
//}