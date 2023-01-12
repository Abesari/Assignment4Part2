package firstSet;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTests = sc.nextInt();
		
		
		for (int i = 0; i < numTests; i++) {
		int type = sc.nextInt();
		int num = sc.nextInt();
		
		
		//I was unsure how to handle the sample input, i tried to use a sequence of if blocks to handle input
		if(type == 1) {
			if(isOdd(num)) {
				System.out.println(num + " is odd");
			} else {
				System.out.println(num + " is even");
			}
		} else if (type == 2) {
            if (isPrime(num)) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        } else if (type == 3) {
            if (isPalindrome(num)) {
                System.out.println(num + " is a palindrome");
            } else {
                System.out.println(num + " is not a palindrome");
            }
	}
	}
	}
		
	public static boolean isOdd(int num) {
		return (num % 2 != 0);
	}
	
	 public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        if (num <= 3) {
	            return false;
	        }
	        for (int i = 5; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	
	 public static boolean isPalindrome(int num) {
	        int originalNum = num;
	        int reversedNum = 0;
	        while (num != 0) {
	            int lastDigit = num % 10;
	            reversedNum = reversedNum * 10 + lastDigit;
	            num /= 10;
	        }
	        return originalNum == reversedNum;
	    }
	}
	
	


