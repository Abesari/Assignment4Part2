package functional;

import java.util.List;

public class Assignment3 {

	public List<Integer> doubler(List<Integer> nums) {
		nums.replaceAll(num -> num * 2);
		return nums;
		
	}
}
