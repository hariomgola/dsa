package dsa_array;

import Main.PrintHelper;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] _array = { 64, 34, 25, 5, 22, 11, 90, 12 };
		int n = _array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (_array[i] > _array[j]) {
					int _temp = _array[i];
					_array[i] = _array[j];
					_array[j] = _temp;
				}
			}
			// Printing
			PrintHelper.ArrayPrintHelper(_array);
		}
	}

}
