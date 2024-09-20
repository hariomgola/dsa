package Main;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintHelper {
	public static void ArrayPrintHelper(int[] _array) {
		System.out.print("[");
		IntStream stream = Arrays.stream(_array);
		stream.forEach(_val -> System.out.print(_val + ","));
		System.out.println("]");
	}
}
