package assignments;

public class EnhancedForLoop {
	static void display(String[] arr) {
		for(String input : arr) {
			char[] ch = input.toCharArray();
			int count = 0;
			for(char temp : ch) {
				if(temp == 'a' || temp == 'e')
					count++;
			}
			System.out.println(input + ":" + count);
		}
	}
	
	static void display1(String[] arr) {
		for(String input : arr) {
			int count = 0;
			for(int index=0;index<input.length();index++) {
				char temp = input.charAt(index);
				if(temp == 'a' || temp == 'e')
					count++;
			}
			System.out.println(input + ":" + count);
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"Vrinda", "Pratik", "Apurva", "Varsha"};
		EnhancedForLoop.display(arr);
}

}
