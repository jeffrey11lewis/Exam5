// Java program to print all combination of size r in an array
// of size n with repetitions allowed

class GFG {
	static int iterations = 0;

	 static void CombinationRepetitionUtil(int chosen[], int arr[],
			int index, int r, int start, int end) {
		if (index == r) {
			for (int i = 0; i < r; i++) {
					
				System.out.printf("%d ", arr[chosen[i]]);
			}
			
			System.out.printf("\n");
			iterations++;
			return;
			
		}

		for (int i = start; i <= end; i++) {
			chosen[index] = i;

			CombinationRepetitionUtil(chosen, arr, index + 1,
					r, i, end);	
		}
		
		return;
	}
	static void CombinationRepetition(int arr[], int n, int r) {

		int chosen[] = new int[r + 1];

		CombinationRepetitionUtil(chosen, arr, 0, r, 0, n - 1);
	}

	public static void main(String[] args) {
		//int arr[] = {1,2,3}; //donut flavors
		int arr[] = {1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
		int n = arr.length;
		//int r = 6; //donut count
		int r = 12;
		CombinationRepetition(arr, n, r);
		
		System.out.println("There are "+ iterations +" possible combinations with " + n + " flavor choices and " + r + " total donuts.");
	}
}

