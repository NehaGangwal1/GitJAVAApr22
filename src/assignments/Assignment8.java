/*Create two parameterized methods in same class. 
 * 
Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Raise PR for the same
*/

package assignments;

public class Assignment8 {
	
	void simpleInterest(float principalAmount,float time,float rate) {
		float simpleInterest;
		simpleInterest= (principalAmount * time * rate)/100 ;
		System.out.println("Simple Interest when PrincipalAmt = " + principalAmount + " , Time = "+ time+" and Rate = " +rate +" is " + simpleInterest);
	}
	
	void temperatureFromFahrenheitToCelsius(float fahrenheit) {
		
		float celcius;
		celcius= (fahrenheit-32)*5/9;
		System.out.println("Temperature in Celcius when temperature in fahrenheit is " +fahrenheit+" = " +celcius);
		}
	
	public static void main(String[] args) {
		Assignment8 assignment8= new Assignment8();
		assignment8.simpleInterest(152560f, 5f,6.85f);
		assignment8.temperatureFromFahrenheitToCelsius(202f);
		
		
	}
}
