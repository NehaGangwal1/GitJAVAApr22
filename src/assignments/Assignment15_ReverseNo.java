package assignments;
/*Program 1 : WAP to verify given number is Perfect number or not.(ArmsStrong No)

input : 153
output : 153 is a perfect number

input : 121 
output : 121 is not a perfect number

Program 2 : WAP to verify given number is Palindrome.
input : 121
output : 121 is palindrome number.

input : 123
output : 123 is not palindrome number.*/


public class Assignment15_ReverseNo {
	
	int reverseNumber(int num) {
		int reverseNum =0;
		while (num>0) {
			int remainder =num%10;
			num= num/10;
			reverseNum = reverseNum*10 + remainder;
		}
		return reverseNum;
	}
	
	void checkNumIsArmstrongOrNot(int num) {
		int sum = 0;
		int orginalNum = num;
		while (num >0) {
			int remainder =num%10;
			num = num/10;
			sum = sum + (remainder * remainder * remainder );
		}
		if (sum == orginalNum) 
			System.out.println( orginalNum + " is Armstrong number");
		else 
			System.out.println(orginalNum + " is not a Armstrong number");
	}
	
	void checkNumIsPalindromeNum(int num) {
		int orginalNum = num;
		int reverseNum = reverseNumber(num);
		if(orginalNum == reverseNum )
			System.out.println(num +  " is Palindrome Number");
		else 
			System.out.println(num +  " is not Palindrome Number");
	}
	
	public static void main(String[] args) {
		Assignment15_ReverseNo assignment15_ReverseNo = new Assignment15_ReverseNo();
		assignment15_ReverseNo.checkNumIsArmstrongOrNot(153);
		assignment15_ReverseNo.checkNumIsArmstrongOrNot(121);
		assignment15_ReverseNo.checkNumIsPalindromeNum(121);
		assignment15_ReverseNo.checkNumIsPalindromeNum(123);
	}
}
