// Java for finding sum of all 
// unique subarray sum 

import java.util.*;

class test3 {

	// function for finding grandSum 
	static int findSubarraySum(int[] arr, int n) {
		int res = 0;

		// Go through all subarrays, compute sums 
		// and count occurrences of sums. 
		HashMap<Integer,
				Integer> m = new HashMap<Integer,
				Integer>();
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				System.out.println(sum);
				if (m.containsKey(sum)) {
					m.put(sum, m.get(sum) + 1);
				} else {
					m.put(sum, 1);
				}
			}
		}

		// Print all those sums that appear 
		// once. 
		for (Map.Entry<Integer,
				Integer> x : m.entrySet()) {
			if (x.getValue() == 1)
				res += x.getKey();
			System.out.println(x.getValue() + "x " + x.getKey());
		}
		return res;
	}

	// Driver code 
	public static void main(String[] args) {
		int arr[] = {3, 2, 3, 1, 4};
		int n = arr.length;
		System.out.println(findSubarraySum(arr, n));
	}
}

// This code is contributed by PrinciRaj1992 
