//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class InverseFactorial {
//	public static void main(String[] args) {
//		Kattio io = new Kattio(System.in, System.out);
////		Scanner scanner = new Scanner(System.in);
////		String input = scanner.nextLine();
//		String input = io.getWord();
//		
//		io.println(input);
//		BigInteger factorial = new BigInteger(input);
//		BigInteger result = BigInteger.ONE;
//		BigInteger loopStart = new BigInteger("1");
//		BigInteger loopEnd = new BigInteger("1000000");
//		BigInteger counter = new BigInteger("0");
//		int comparator;
//
//		for (BigInteger i = loopStart; i.compareTo(loopEnd) < 1; i = i.add(BigInteger.ONE)) {
//			comparator = result.compareTo(factorial);
//			if (comparator == 0) {
////				System.out.println(counter);
//				io.println(counter);
//				break;
//			} else if (comparator == 1) {
//				counter = counter.subtract(BigInteger.ONE);
////				System.out.println(counter);
//				io.println(counter);
//				break;
//			} else {
//				result = result.multiply(i);
//				counter = counter.add(BigInteger.ONE);
//			}
//		}
//	}
//}