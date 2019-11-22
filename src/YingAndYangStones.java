import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  yinyangstones Yin and Yang Stones
 * Link: https://open.kattis.com/problems/yinyangstones ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/21/2019
 * Method : none
 * Status : ACCEPTED
 * Runtime: 0.21s
 */
public class YingAndYangStones {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray();
		int black = 0, white = 0, len = input.length;
		for (int i = 0; i < len; i++) {
			if(input[i] == 'B') black++;
			else white++;
		}
		if(black == white) System.out.println(1);
		else System.out.println(0);
	}
}
