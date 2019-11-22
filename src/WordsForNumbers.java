import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  wordsfornumbers Words for Numbers?
 * Link: https://open.kattis.com/problems/wordsfornumbers ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/22/2019
 * Method : none
 * Status : ACCEPTED
 * Runtime: 0.20s
 */
public class WordsForNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		boolean mustBeUppercase;
		String line;
		String[] arrLine;
		String[] arrNumbers1 = {
				"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty"
		};
		String[] arrNumbers2 = {
				"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety",
		};
		String[] arrNumbers3 = {
				"zero", "ten", "twenty-", "thirty-", "forty-", "fifty-", "sixty-", "seventy-", "eighty-", "ninety-",
		};
		int lenOfArrLine, num, secondDigit;


		while ((line = in.readLine()) != null) {
			arrLine = line.split(" ");
			lenOfArrLine = arrLine.length;
			for (int i = 0; i < lenOfArrLine; i++) {
				try {
					num = Integer.parseInt(arrLine[i]);
				} catch (NumberFormatException e) {
					out.print(arrLine[i] + " ");
					continue;
				}

				mustBeUppercase = i == 0;

				if (num <= 20) {
					if (mustBeUppercase) {
						out.print(arrNumbers1[num].substring(0, 1).toUpperCase() + arrNumbers1[num].substring(1) + " ");
					} else out.print(arrNumbers1[num] + " ");
				} else {
					secondDigit = num % 10;
					num /= 10;
					if (secondDigit == 0) {
						if (mustBeUppercase) {
							out.print(arrNumbers2[num].substring(0, 1).toUpperCase() + arrNumbers2[num].substring(1) + " ");
						} else out.print(arrNumbers2[num] + " ");
					} else {
						if(mustBeUppercase) {
							out.print(arrNumbers3[num].substring(0,1).toUpperCase() + arrNumbers3[num].substring(1) + arrNumbers1[secondDigit] + " ");
						} else out.print(arrNumbers3[num] + arrNumbers1[secondDigit] + " ");
					}
				}
			}
			out.println();
		}
		out.flush();
		out.close();
	}
}