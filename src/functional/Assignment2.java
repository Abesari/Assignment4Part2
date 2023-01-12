package functional;

import java.util.List;

public class Assignment2 {

	public List<Integer> rightMost(List<Integer> nums) {
		nums.replaceAll(num -> num % 10);
		return nums;
	}
}
