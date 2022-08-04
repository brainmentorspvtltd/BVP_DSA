class SumOfEvenByRec {
	static void SumOfEven(int arr[],
			int i, int sum) {
		if (i < 0) {
			System.out.print(sum);
			return;
		}
		if ((arr[i]) % 2 == 0) {
			sum += (arr[i]);
		}
		SumOfEven(arr, i - 1, sum);
	}
	public static void main(String[] args)
			throws java.lang.Exception {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = arr.length;
		int sum = 0;
		SumOfEven(arr, n - 1, sum);
	}
}