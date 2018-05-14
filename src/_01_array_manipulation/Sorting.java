package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] testArray) {
		int sensible = testArray.length;
		for (int i = 0; i < sensible; i++) {
			for (int j = i + 1; j < sensible; j++) {
				if (testArray[i].compareTo(testArray[j]) > 0) {
					String t = testArray[i];
					testArray[i] = testArray[j];
					testArray[j] = t;
				}
			}
		}

	}
}
