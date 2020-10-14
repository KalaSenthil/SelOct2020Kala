package week1.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] seq = {3,2,11,4,6,7};
		int length = seq.length;
		System.out.println("Array Length: "+length);
		System.out.println("Print Original Array");
		for(int i=0;i<length;i++)
			System.out.print(seq[i]+",");
		System.out.println();
		Arrays.sort(seq);	
		System.out.println("Print Sorted Array");
		for(int i=0;i<length;i++)
			System.out.print(seq[i]+",");
		System.out.println();
		System.out.println("Second Largest in array is: "+seq[4]);
		
		
	}

}
