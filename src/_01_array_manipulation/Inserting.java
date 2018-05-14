package _01_array_manipulation;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		int[] newi = new int[testArray.length + 1];
		for (int k = 0; k < j; k++) {
			newi[k] = testArray[k];
		}
		newi[j] = i;
		for (int k = j + 1; k < testArray.length + 1; k++) {
			newi[k] = testArray[k - 1];
		}
		return newi;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		String[] alpha = new String[orderedArray.length];
		for (int i = 0; i < orderedArray.length; i++) {
			alpha[i].equals(orderedArray[i]);
		}
		alpha[orderedArray.length].equals(string);
		Sorting.sort(alpha);
		return alpha;
	}

}
