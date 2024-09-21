package dsa_array;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] _array = { 64, 34, 25, 12, 22, 11, 90, 5 };
		int n = _array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (_array[j] > _array[j + 1]) {
					int _temp = _array[j];
					_array[j] = _array[j + 1];
					_array[j + 1] = _temp;
				}
			}
			// Printing
//			PrintHelper.ArrayPrintHelper(_array);
		}
	}
}
