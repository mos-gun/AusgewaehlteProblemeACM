public class test2 {

	private static int counter = 0;
	
	public static void getSum(int[] numbersArray, int starting, int sum) {
		boolean isDuplicate = false;
		if (numbersArray.length == starting) {
			// Now we print sum here
			for (int i = 0; i < numbersArray.length; i++) {
				if(sum == numbersArray[i]) isDuplicate = true;
			}
			if(!isDuplicate) {
				System.out.println("sum: " + sum + "\tcounter: " + counter + "\n");
				counter--;
			}
			return;
		}

		int value = sum + numbersArray[starting];

		counter++;
		System.out.println(value);
		getSum(numbersArray, starting + 1, value);
		getSum(numbersArray, starting + 1, sum);
	}

	public static void main(String[] args) {
		getSum(new int[]{1, 2, 4, 5}, 0, 0);
	}
}