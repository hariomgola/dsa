package dsa_hash;

import java.util.Arrays;
import java.util.HashSet;

public class hash_sets {

	public static void main(String[] args) {
		HashSet<String> _hs = new HashSet<String>();
		String data[] = "hariomgola".split("");
		for (int i = 0; i < data.length; i++) {
			_hs.add(data[i]);
		}

		// All function
		System.out.println("|> - " + _hs.toString());
		System.out.println("|> - " + Arrays.toString(_hs.toArray()));
		System.out.println("|> - " + _hs.size());
		System.out.println("|> - " + _hs.isEmpty());
		System.out.println("|> - " + _hs.getClass());

		for (String value : _hs) {
			System.out.println(" -> " + value);
		}
	}

}
