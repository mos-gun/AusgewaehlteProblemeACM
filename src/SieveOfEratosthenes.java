//import java.util.Scanner;
//
//public class SieveOfEratosthenes {
//
//	public void primes(int n) {
//		boolean[] primes = new boolean[n + 1];
//		for (int i = 2; i < primes.length; i++) {
//			primes[i] = true;
//		}
//		int num = 2;
//		while (true) {
//			for (int i = 2;; i++) {											// set all multiples of num to false
//				int multiple = num * i;										// (multiples of num cant be primes)
//				if (multiple > n) {											// only search until num > n/2
//					break;													// because multiple will be over n
//				} else {
//					primes[multiple] = false;
//				}
//			}
//			boolean nextNumFound = false;
//			for (int i = num + 1; i < n + 1; i++) {							// search for next biggest prime
//				if (primes[i]) {											// repeat until all multiples set to false
//					num = i;												// 
//					nextNumFound = true;
//					break;
//				}
//			}
//			if (!nextNumFound) {
//				break;
//			}
//		}
//		for (int i = 0; i < primes.length; i++) {
//			if (primes[i]) {
//				System.out.println(i);
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int n = scanner.nextInt();
//		SieveOfEratosthenes sieve = new SieveOfEratosthenes();
//		sieve.primes(n);
//	}
//}