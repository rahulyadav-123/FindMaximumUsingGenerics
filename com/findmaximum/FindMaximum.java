package com.findmaximum;

public class FindMaximum {
	//main method
		public static void main(String args[]) {
			Integer intVal1 = 12, intVal2 = 13, intVal3 = 9;
			Float floatVal1 = 12.55f, floatVal2 = 13.65f, floatVal3 = 19.22f;
			String strVal1 = "Rohit", strVal2 = "Rahul", strVal3 = "Roshani";
			
			//call generic method
			toprint(intVal1, intVal2, intVal3);
			toprint(floatVal1, floatVal2, floatVal3);
			toprint(strVal1, strVal2, strVal3);
		}

		//generic method
		private static <E extends Comparable<E>> void toprint(E val1, E val2, E val3) {
			
			//assign value to max
			E max = val1;
			
			//check value is greater of not
			if (val2.compareTo(max) > 0) {
				max = val2;
			}
			if (val3.compareTo(max) > 0) {
				max = val3;
			}
			System.out.println("Amongst the three the maximum is " + max);
		}
	}
