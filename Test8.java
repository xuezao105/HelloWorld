public class Test8 {
	public static void main(String[] args) {
		double[] myList = {
				3.4,4.5,5.6,6.7
		};
		// Print all the array elements
		for(int i = 0;i < myList.length;i++) {
		System.out.println("myList[i]" + " ");
	}
	// Summing all elements
	double total = 0;
	for(int i = 0;i < myList.length;i++) {
		total += myList[i];
	}
	System.out.println("Total is " + total);
	// Find the largest element
	double  max = myList[0];
	for(int i = 1;i < myList.length;i++) {
		if(myList[i] > max)max = myList[i];
	}
	System.out.println("Max is " + max);
	}
}