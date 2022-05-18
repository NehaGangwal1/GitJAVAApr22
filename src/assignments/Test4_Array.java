/*WAP to return count of visibile tree from given tree height array. 

input : {5,5,9,11,10,17,33,29}
output : 5
input : {11,9,10,5,7}
output : 1
input : {3,5,9,13}
output : 4
*/

package assignments;

import java.util.Arrays;

public class Test4_Array {
	
	int visiblityOFTree(int[] arr) {
		
		int count=1;
		int maxNum = arr[0];
		for (int index=0;index<arr.length;index++) {
			if (maxNum < arr[index]) {
				maxNum = arr[index];
				count++;
			}
		}				
		return count;
	}
	
	public static void main(String[] args) {
		 Test4_Array test4_Array = new Test4_Array();
		 int[] arr = {5,5,9,11,10,17,33,29};
		 System.out.println("Output 1:");
		 System.out.println("count of visibile tree from given " + Arrays.toString(arr) + " tree height array is " +  test4_Array.visiblityOFTree(arr));
		 int[] arr2 = {11,9,10,5,7};
		 System.out.println("Output 2:");
		 System.out.println("count of visibile tree from given " + Arrays.toString(arr2) + " tree height array is " +  test4_Array.visiblityOFTree(arr2));
		 int[] arr3 = {3,5,9,13};
		 System.out.println("Output 3:");
		 System.out.println("count of visibile tree from given " + Arrays.toString(arr3) + " tree height array is " +  test4_Array.visiblityOFTree(arr3));	
	}

}
