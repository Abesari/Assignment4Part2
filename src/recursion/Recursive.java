package recursion;

public class Recursive {

	public boolean identicalSumOrNot(int start, int[] nums, int target) {
		boolean identical = false;
		 return lengthofIdenticals(start, nums, target, 0, identical);
		}
	
	//i tried to use a helper function
	private boolean lengthofIdenticals(int start, int[] nums, int target, int length, boolean identical) {
		if(start >= nums.length) {
			return target == 0;
		}
		if(start < nums.length - 1 && nums[start] == nums[start + 1]) {
			length++;
		} else {
			if(lengthofIdenticals(start + length, nums, target - length * nums[start], 0, identical)) {
				return true;
			}
			if (lengthofIdenticals(start + length, nums, target, 0, identical )) {
				return true;
			}
			return false;
		}
		return lengthofIdenticals(start +1, nums, target, length, identical);
	}
}
