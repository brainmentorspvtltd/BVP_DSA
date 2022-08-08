
public class MajorityElement {
	
	static int majorityElement(int arr[]) {
		int n = arr.length;
		int majorityCount = n / 2;
		for(int num : arr) {
			int count = 0;
			for(int elem : arr) {
				if(elem == num) {
					count += 1;
				}
			}
			if(count > majorityCount) {
				return num;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,1,1,1,2,2};
		int e = majorityElement(arr);
		System.out.println(e);
	}

}
