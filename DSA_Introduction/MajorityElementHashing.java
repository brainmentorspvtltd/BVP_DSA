import java.util.HashMap;
import java.util.Map;

public class MajorityElementHashing {
	
	static Map<Integer, Integer> countNums(int nums[]) {
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		for(int num : nums) {
			if(!counts.containsKey(num)) {
				counts.put(num, 1);
			}
			else {
				counts.put(num, counts.get(num) + 1);
			}
		}
		return counts;
	}
	
	static int majorityElement(int []nums) {
		Map<Integer, Integer> counts = countNums(nums);
		Map.Entry<Integer, Integer> majority = null;
		for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
			if(majority == null || entry.getValue() > majority.getValue()) {
				majority = entry;
			}
		}
		return majority.getKey();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,1,1,1,2,2};
		int e = majorityElement(arr);
		System.out.println(e);

	}

}
