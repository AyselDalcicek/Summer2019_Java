package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class Myself_Review_WarmUp {

	public static void main(String[] args) {

		// task01:
		int[] array1 = { 1, 2, 3, 4, 5 };

		System.out.println(ArrayToArrayList(array1)); // [1, 2, 3, 4, 5]
		// OR
		ArrayList<Integer> list = ArrayToArrayList(array1);
		System.out.println(list); // [1, 2, 3, 4, 5]
		
				// task02:
				double[] array2 = { 1.2, 3.5, 4.0 };
		
				System.out.println(ArrayToArrayList(array2)); // [1.2, 3.5, 4.0]
				// OR
				ArrayList<Double> list2 = ArrayToArrayList(array2);
				System.out.println(list2); // [1.2, 3.5, 4.0]

		// task03:

		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 4, 90, 30, 100));

		System.out.println(maxNumber(list3)); // 100
		// OR
		int maxim = maxNumber(list3);
		System.out.println(maxim); // 100

				// task04:
				ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1, 600, 700, 700, 50, 0));
		
				int secondMaxNumber =seconMaxNum(list4); 
				System.out.println(secondMaxNumber); // 600
				
		
	    // task05: 
		
		ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(0,9,300,600,1000));
		System.out.println(minNumber(list5)); // 0
				//OR
		int[] minimum = {800, 60000, 400, -70};
		
		ArrayList<Integer> list5_2 = ArrayToArrayList(minimum);
		
		int minNumber = minNumber(list5_2);
		System.out.println(minNumber); // -70
		
		
		
		 		// task06: 
		
				int[] secMinNum = {100, 400, 600, 18, 0, 0, 0};
				ArrayList<Integer> list6 = ArrayToArrayList(secMinNum);
				int secondMinimumNumber = secondMin(list6);
				System.out.println(secondMinimumNumber); // 18
				
						
		 
	}

	// Task01 -write a return method that accepts an int array and returns it as an
	// ArrayList
	public static ArrayList<Integer> ArrayToArrayList(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>();

		for (Integer each : arr) {
			list.add(each);
		}
		return list;
	}

	// Task02 -write a return method that accepts a double array and returns it as
	// an ArrayList

	public static ArrayList<Double> ArrayToArrayList(double[] arr) {

		ArrayList<Double> list = new ArrayList<>();

		for (Double each : arr) {
			list.add(each);
		}

		return list;

	}

	// Task03 -write a return method that accepts an Integer arrayList and returns
	// the maximum number
	// DO NOT USE SORT METHOD

	public static int maxNumber(ArrayList<Integer> list) {

		int max = Integer.MIN_VALUE;
		for (int each : list) {
			if (each > max) {
				max = each;
			}
		}
		return max;

	}

	// Task04 -write a return method that accepts an Integer arrayList and returns the second maximum number
		// DO NOT USE SORT METHOD

	public static int seconMaxNum(ArrayList<Integer> list) {

		Integer max = maxNumber(list);

		list.removeAll(Arrays.asList(max));

		int secondMax = maxNumber(list);

		return secondMax;

	}
	
	// Task05 -write a return method that accepts an Integer array and returns the minimum number
		// DO NOT USE SORT METHOD
	
	public static int minNumber(ArrayList<Integer> list) {
		int min=Integer.MAX_VALUE;
		for(Integer each :list) {
			if(each<min) {
				min=each;
			}
		}
		
		return min;
		
				
		
	}
	
	// Task06 write a return method that accepts an Integer arrayList and returns the second minimum number
        // DO NOT USE SORT METHOD
	
	public static int secondMin(ArrayList<Integer> list) {
		
		 int firstMin = minNumber(list);
		 
		 list.removeAll(Arrays.asList(firstMin));
		
		 return minNumber(list);
		
		
		
	}
	 

}
