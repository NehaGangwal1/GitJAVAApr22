/*
WAP to perform following action.
1. Convert Ascii to Character.
2. Convert Character to Ascii.
3. Print all the characters within range 91 to 96.
4. Print ascii for all characters between A-Z.
5. Return a String by converting each character to its next character.
   input : acpz
   output : bdqa
    input : AvZp
   output : BwAq
    input : Av-Z$p
   output : Bw-A$q*/

package assignments;

public class Assignment20_ASCII {
	
	void convertAsciiToCharacter(int ascii) {
		char ch = (char)ascii;
		System.out.println(ascii + " -- " + ch );
	}
	
	 void convertCharacterToAscii(char ch) {
		
		int num = ch;
		System.out.println(ch + " - " + num);	
	}
	
	void printAllCharWithinRange(int startRan, int endRan) {
		
		for(int index = startRan;index<=endRan;index++) {
			convertAsciiToCharacter(index);
		}
	}
	
	void printAsciiForCharacter(char startRan, char endRan) {
		
		for (char index = startRan;index<=endRan;index++) {
			convertCharacterToAscii(index);
		}
	}
	
	String convertCharacterToNextCharacter(String input) {
		String output = "";
		
		for (int index=0;index<input.length();index++) {
			 char ch =input.charAt(index);
			
			if (ch == 'z') 
				output += "a";	
			
			else if (ch == 'Z') 
				output += "A";
			
			else if  (Character.isDigit(ch) || Character.isLetter(ch)) 
				output += ++ch ;
			
			else 
				output +=ch;
		}
		return output;
	}
	
	public static void main(String[] args) {
		 Assignment20_ASCII assignment20_ASCII =  new Assignment20_ASCII();
		 System.out.println("Output 1 :");
		 assignment20_ASCII.convertAsciiToCharacter(100);
		 System.out.println("Output 2:");
		 assignment20_ASCII.convertCharacterToAscii('c');
		 System.out.println("Output 3:");
		 assignment20_ASCII.printAllCharWithinRange(91, 96);
		 System.out.println("Output 4:");
		 assignment20_ASCII.printAsciiForCharacter('A', 'Z');
		 System.out.println("Output 5:");
		 System.out.println("converting each character to its next character");
		 System.out.println("acpz -- " + assignment20_ASCII.convertCharacterToNextCharacter("acpz"));
		 System.out.println("AvZp -- "+assignment20_ASCII.convertCharacterToNextCharacter("AvZp"));
		 System.out.println("Av-Z$p -- "+assignment20_ASCII.convertCharacterToNextCharacter("Av-Z$p"));
	}
}
