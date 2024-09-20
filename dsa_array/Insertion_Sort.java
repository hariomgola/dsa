package dsa_array;

import Main.PrintHelper;

public class Insertion_Sort {

	public static void main(String[] args) {
		int[] _array = { 64, 34, 25, 12, 22, 11, 90, 5 };
		int n = _array.length;

		for (int i = 1; i < n ; i++) {
			int insertIndex = i;
			int currentValue = _array[i];
			int j = i - 1;

			while (j >= 0 && _array[j] > currentValue) {
				_array[j + 1] = _array[j];
				insertIndex = j;
				j--;
			}
			_array[insertIndex] = currentValue;
			PrintHelper.ArrayPrintHelper(_array);
		}
	}

}
