import java.io.*;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  piglatin Pig Latin
 * Link: https://open.kattis.com/problems/piglatin ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/21/2019
 * Method : none
 * Status : ACCEPTED
 * Runtime: 0.65s
 */
class PigLatin {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String[] arrInput;
		String input;
		StringBuilder sb;
		char[] arrTempWord;
		int lenOfArrInput, lenOfTempWord;

		while ((input = in.readLine()) != null) {
			arrInput = input.split(" ");
			lenOfArrInput = arrInput.length;

			for (int i = 0; i < lenOfArrInput; i++) {
				arrTempWord = arrInput[i].toCharArray();
				lenOfTempWord = arrTempWord.length;
				sb = new StringBuilder(arrInput[i]);

				for (int j = 0; j < lenOfTempWord; j++) {
					if (arrTempWord[j] == 'a' || arrTempWord[j] == 'e' ||
							arrTempWord[j] == 'i' || arrTempWord[j] == 'o' ||
							arrTempWord[j] == 'u' || arrTempWord[j] == 'y') {
						if (j == 0) {
							sb.append("yay ");
							out.print(sb);
						} else {
							sb.append(sb.substring(0, j));
							out.print(sb.append("ay ").substring(j));
						}
						break;
					}
				}
			}
			out.println();
		}
		out.flush();
		out.close();
	}
}