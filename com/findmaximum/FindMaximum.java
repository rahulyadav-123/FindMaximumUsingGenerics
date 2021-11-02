package com.findmaximum;

public class FindMaximum {
	//main method
		public static void main(String args[]) {
			//string values
			String strVal1 = "Rohit", strVal2 = "Rahul", strVal3 = "Roshani";
			
			//assign 1st value to max
			String max = strVal1;
			
			//checking max with other values
			if (strVal2.compareTo(max) > 0) {
				max = strVal2;
			}
			if (strVal3.compareTo(max) > 0) {
				max = strVal3;
			}
		
			//printing maximum value among three
			System.out.println("Amongst the three the maximum is " + max);
		}
}