import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.apache.commons.collections4.ListUtils.partition;

class EqualSums_Easy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases, numOfValues;
		int[] arrValues;
		ArrayList<Integer> listValues = new ArrayList<>();
		
		numOfCases = Integer.parseInt(scanner.nextLine().trim());

		for (int i = 0; i < numOfCases; i++) {
			numOfValues = scanner.nextInt();
			arrValues = new int[numOfValues];
			for (int j = 0; j < numOfValues; j++) {
				arrValues[j] = scanner.nextInt();
				listValues.add(arrValues[j]);
			}

//			List<List<Integer>> lists = ListUtils.partition(listValues,2);

//			for (List list : lists) {
//				System.out.println(list);
//			}
			
			getSum(arrValues,0,0);

		}
	}

	public static void getSum(int[] numbersArray, int starting, int sum)
	{
		if(numbersArray.length == starting)
		{
			// Now we print sum here
			System.out.println(sum);
			return;
		}

		int value = sum + numbersArray[starting];

		getSum(numbersArray, starting + 1, value);
		getSum(numbersArray, starting + 1, sum);
	}
}