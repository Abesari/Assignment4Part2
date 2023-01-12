package firstSet;

public class operationLambda {

	public PerformOperation isOdd() {
		return (int x) -> x % 2 != 0;
	}
	
	public PerformOperation isPrime() {
		return (int x) -> {
			if(x <= 1) {
				return false;
			}
			for (int i =2; i <= Math.sqrt(x); i++) {
				if(x % i ==0) {
					return false;
				}
			}
			return true;
		};
	}
	
	public PerformOperation isPalindrome() {
		return (int x) -> {
			int oriNum = x;
			int revNum = 0;
			while (x != 0) {
				int lastDigit = x % 10;
				revNum = x % 10;
				revNum = revNum * 10 + lastDigit;
				x /= 10;
			}
			return oriNum == revNum;
		};
	}
	
}
