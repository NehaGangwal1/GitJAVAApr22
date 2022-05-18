/*Assignment - 10 : 23rd April'2022

Program 1: Write a program to find frequency of given character from given string.
input : word -> technocredits
        ch -> e
output : e -> 2

Program 2: WAP to find frequency of all characters from given string.
input : word -> technocredits
output : t -> 2
         e -> 2
	 	 c -> 2
		 h -> 1	
		 n -> 1																														
		 o -> 1
		 r -> 1
		 d -> 1
		 i -> 1
		 s -> 1
Program 3 : WAP to return count of digits in given string.
input : word -> Tec1hnoc3re9di7ts2
output : 5

Program 4 : WAP to print count of capital letter, lowercase letter & digits in given string.
input : word -> Tec1hnoC3re9di7ts2
output : Capital letter: 2
         Small letter : 11
		 digits : 5
		
Program 5 : WAP to return first Capital letter from given string.
input : word -> technoCrediTS
output : C
*/

package assignments;

public class Assignment10_Char {

	int getFrequency(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}

	void printEachCharFreq(String input) {
		System.out.println("Output2:");
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			if (index == input.indexOf(ch)) {
				count = getFrequency(input, ch);
				System.out.println(ch + "-> " + count);
			}
		}
	}

	int countOfDigit(String word) {
		System.out.println("Output3:");
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			if (Character.isDigit(word.charAt(index))) {
				count++;
			}
		}
		return count;
	}

	void countOfLetterAndDigit(String word) {
		System.out.println("Output4:");
		int digit = 0;
		int capitalLetter = 0;
		int lowerCase = 0;
		for (int index = 0; index < word.length(); index++) {
			if (Character.isDigit(word.charAt(index))) {
				digit++;
			} else if (Character.isUpperCase(word.charAt(index))) {
				capitalLetter++;
			} else if (Character.isLowerCase(word.charAt(index))) {
				lowerCase++;
			}
		}
		System.out.println("Number of Capital Letter in given word " + word + " is " + capitalLetter);
		System.out.println("Number of Lower Case in given word " + word + " is " + lowerCase);
		System.out.println("Number of digits in given word " + word + " is " + digit);
	}

	char getFirstCapitalLetter(String word) {
		System.out.println("output 4 :");
		char ch = 0;
		for (int index = 0; index < word.length(); index++) {
			if (Character.isUpperCase(word.charAt(index))) {
				ch = word.charAt(index);
				break;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		Assignment10_Char assignment10_Char = new Assignment10_Char();
		String input = "technocredits";
		char ch = 'e';
		int ans = assignment10_Char.getFrequency(input, ch);
		System.out.println("Output1: " + ch + "->" + ans);
		assignment10_Char.printEachCharFreq(input);
		String word = "Tec1hnoc3re9di7ts2";
		int count = assignment10_Char.countOfDigit(word);
		System.out.println("Number of digits in given word " + word + " is " + count);
		assignment10_Char.countOfLetterAndDigit(word);
		char result = assignment10_Char.getFirstCapitalLetter("technoCrediTS");
		System.out.println("The First Capital letter in 'technoCrediTS' is " + result);

	}
}
