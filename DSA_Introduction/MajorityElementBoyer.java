
public class MajorityElementBoyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,2,3,2,2,2,1,1,1,1,1};
		int majorityElement = 0;
		int count = 0;
		
		/*
		 * Logic : we maintain a count, which is incremented whenever we see
		 * an instance of our array current element is equal to majority
		 * and decrement whenever we see anything else
		 */
		for(int i = 0; i < arr.length; i++) {
			if(count == 0) {
				majorityElement = arr[i];
			}
			
			if(majorityElement == arr[i]) {
				count++;
			}
			else {
				count--;
			}
		}
		count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == majorityElement) {
				count++;
			}
		}
		String msg = count > arr.length / 2 ? "Majority Element :: " + majorityElement : "No Majority Element Exists";
		System.out.println(msg);

	}

}
