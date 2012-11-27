package com.dchan.learning.algorithm.sort;
/**
 * Examining what Bubble sort looks like. For more information visit -
 * @author Dchan (Dulitha R. Wijewantha -dulithaz@gmail.com)
 *
 */
public class BubbleSortExamine {
	public static void main(String[] args) {
		int[] testArray = new int[] { 1, 3, 7, 3, 7, 9, 4, 8, 1, 2, 5, 6, 4, 2,
				8, 1, 22, 43, 54, 23, 67, 45, 23, 67, 34, 23 };
		int[] sort = sort(testArray);
		for (int i = 0; i < sort.length; i++) {
			int j = sort[i];
			System.out.print(j + ",");
		}
	}

	private static int[] sort(int[] testArray) {
		int size = testArray.length;
		int[] targetArray = new int[size];
		for (int i = 0; i < size; i++) {
			targetArray[i] = testArray[i];
			for (int j = 0; j < size - i; j++) {
				if (targetArray[i] < targetArray[j]) {
					swap(targetArray, i, j);
				}
				System.out.println("Running inner");
			}
			System.out.println("Running outter");
		}
		return targetArray;
	}

	private static void swap(int[] targetArray, int i, int j) {
		int previous = targetArray[j];
		targetArray[j] = targetArray[i];
		targetArray[i] = previous;
	}

	private static int[] sortEF(int[] sortArray) {
		boolean cont = true;
		while (cont) {
			cont = false;
			for (int i = 0; i < sortArray.length - 1; i++) {
				if (sortArray[i] > sortArray[i + 1]) {
					swap(sortArray, i, i + 1);
					cont = true;
				}
			}
		}
		return sortArray;
	}

	private static int[] sortKF(int[] sortArray) {
		boolean cont = true;
		int size = sortArray.length;
		while (cont) {
			cont = false;
			size--;
			for (int i = 0; i < size; i++) {
				if (sortArray[i] > sortArray[i + 1]) {
					swap(sortArray, i, i + 1);
					cont = true;
				}
			}
		}
		return sortArray;
	}

}
