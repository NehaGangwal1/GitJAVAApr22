/*Assignment -7 : 16th APR�22

Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.
1. Create class called �StudentInfo�
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber as int.
3. Create two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create main method.
7. write a logic in main method.
	a. Create object of StudentInfo class.
	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run

Output example:
Shikha
Amit
Patel
10th Aug 1998
G-809, Heaven Apartment, Baner, Pune.
34
*/
package assignments;

public class Assignment7_StudentInfo {
	
	void studentName(String name,String middleName, String surname) {
		
		System.out.println(name);
	    System.out.println(middleName);
	    System.out.println(surname);
	}
	
	void studentOtherDetails(String birthdate,String address,int rollno) {
		
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
		
	}
 
	public static void main(String[] args) {
		Assignment7_StudentInfo studentinfo= new Assignment7_StudentInfo();
		studentinfo.studentName("Neha", "Sunil", "Gangwal");
		studentinfo.studentOtherDetails("10th jun 1998", "G-809, Heaven Apartment, Baner, Pune", 101);
	}

}
