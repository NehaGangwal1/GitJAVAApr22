/*WAP to convert character cases for the array elements having no digits.

Input : {"haRsH" , "te3cHNO", "cREdits" , "kRISHn9a"}
output : haRsH -> HArSh
              te3cHNO -> Contains digit
              cREdits -> CreDITS
              kRISHn9a -> Contains digit*/


package assignments;

public class Assignment16 {
	
	boolean isdigitPresent(String input) {
		boolean flag = false;
		for(int index=0;index<input.length();index++) {	
			flag = Character.isDigit(input.charAt(index));	
			if(flag == true) {
				break;
			}
		}
		return flag;
	}
	
	String convertCharCase(String input) {				
		String output = "";
		for (int index=0;index<input.length();index++) {	
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				output += Character.toLowerCase(ch);
			}
			else if (Character.isLowerCase(ch)) {
				output+= Character.toUpperCase(ch);
			}	
		}
		return output;
	}
	
	void convertCaseOfArrayElementsWithNoDigit(String[] inputArray) {
		for(int index=0;index<inputArray.length;index++) {
			String input = inputArray[index];  //haRsH
			 boolean flag = isdigitPresent(input);	//False
			 if(flag==true) {
				 System.out.println(input + " -> Contains Digit");
			 }
			 else {
				String ans = convertCharCase(input);	//haRsH
				 System.out.println(input + " -> " + ans);
			 }
		}
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		String[] inputArr = {"haRsH" , "te3cHNO", "cREdits" , "kRISHn9a"};
		System.out.println("Output is ");
		assignment16.convertCaseOfArrayElementsWithNoDigit(inputArr);
		
	}
}
