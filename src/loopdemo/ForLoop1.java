package loopdemo;

public class ForLoop1 {
	
	void display(String name, int count) {
		for (int index=1;index<=count;index++) {
			System.out.println(name + "--" + index);
		}
	}
	public static void main(String[] args) {
		ForLoop1 forLoop1 = new ForLoop1(); 
		forLoop1.display("neha", 10);
		
	}
}