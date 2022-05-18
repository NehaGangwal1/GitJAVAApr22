/*Program 1 : Return the name having maximum length from given array.

input = {"Maulik", "Tamanna", "Technocredits","Aashvi"};
output : Technocredits

Program 2 : print number of digits in each element of array.
input : {"Ma1ul2ik", "H9arsh", "K1r3i4sh7n8a", "Aashvi", "Pra1t2i3k4"}
output : Ma1ul2ik --> 2
         H9arsh --> 1
		 K1r3i4sh7n8a -> 4
		 Aashvi - > 0

Program 3 : print the name from array having no capital letter.
input : {"Ma1ul2iK", "h9arsh", "K1r3i4sh7N8a", "AasHvi", "PrA1t2i3k4", "rakesh"}
output : h9arsh
         rakesh
		
Program 4 : return the name having maximum digits from given array.
input : {"Ma1ul2iK", "h9arsh", "K1r3i4sh7N8a", "AasHvi", "PrA1t2i3k4", "rakesh"}
output : K1r3i4sh7N8a
         
Program 5 : print the sum of all digits present in array.
input : {"H1i2", "Tech9no", "cr5edits"}
hint : 1+2+9+5
output : 17 
*/
package assignments;

public class Assignment12_Array {
	
	String getMaxLengthName(String [] inputArray) {
		int maxLength=0;
		String maxName="";
		
		for (int index=0;index<inputArray.length;index++) {
			if (maxLength < inputArray[index].length()) {
				maxLength = inputArray[index].length();
				maxName = inputArray[index];
			}	
		}
		return maxName;
	}
	
	int findNoOfDigitInString(String input) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if (Character.isDigit(input.charAt(index))) {
				count++;
			}	
		}
		return count;
	}
	
	void printNoOfDigitInArray(String [] inputArray) {
		System.out.println("Number of digits in each element of Array");
		for (int index=0;index<inputArray.length;index++) {
			 System.out.println(inputArray[index] + " -> " + findNoOfDigitInString(inputArray[index]));
		}	
	}
	
	void printNameWitthNoCapsLetter(String[] inputArray) {
		for (int index=0;index< inputArray.length;index++) {
			String str= inputArray[index];
			boolean isNoCapitalLetter= true;
			for(int i=0;i<str.length();i++) {
				if(Character.isUpperCase(str.charAt(i))){
					isNoCapitalLetter=false;
				}		
			}
			if (isNoCapitalLetter==true) {
				System.out.println(str);
			}
		}
	}
	
	String nameHavingMaxDigit(String[] inputArray) {
		int maxDigitCount=0;
		String maxName="";
		for (int index=0;index<inputArray.length;index++) {
			int count = findNoOfDigitInString(inputArray[index]);
			if (maxDigitCount < count){
				maxName=inputArray[index];
				maxDigitCount=count;	
			}	 	 
		}
		return maxName;	
	}
	int sum=0;
	void printSumInString(String input) {
		for (int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum= sum + Character.getNumericValue(ch);
				}
		}
	}	
	void printSumOfAllDigitInArray(String[] inputArray) {
		for (int index=0;index<inputArray.length;index++) {
			String str= inputArray[index];
			printSumInString(str);
		}
		System.out.println("the sum of all digits present in array is " + sum);
	}
	public static void main(String[] args) {
		Assignment12_Array assignment12_Array = new Assignment12_Array();
		String[] input1 = {"Maulik", "Tamanna", "Technocredits","Aashvi"};
		System.out.println("Output 1:");
		System.out.println("Maxmimum Length String from given Array is "+ assignment12_Array.getMaxLengthName(input1));
		String[] input2 =  {"Ma1ul2ik", "H9arsh", "K1r3i4sh7n8a", "Aashvi", "Pra1t2i3k4"};
		System.out.println("Output2 :");
		assignment12_Array.printNoOfDigitInArray(input2);
		String[] input3 = {"Ma1ul2iK", "h9arsh", "K1r3i4sh7N8a", "AasHvi", "PrA1t2i3k4", "rakesh"};
		System.out.println("Output3 :");
		assignment12_Array.printNameWitthNoCapsLetter(input3);
		String[] input4 = {"Ma1ul2iK", "h9arsh", "K1r3i4sh7N8a", "AasHvi", "PrA1t2i3k4", "rakesh"};
		System.out.println("Output4");
		System.out.println(assignment12_Array.nameHavingMaxDigit(input4));
		String[] input5 = {"H1i2", "Tech9no", "cr5edits"};
		System.out.println("Output5:");
		assignment12_Array.printSumOfAllDigitInArray(input5);
	}
}
