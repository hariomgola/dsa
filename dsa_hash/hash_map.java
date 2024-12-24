package dsa_hash;

import java.util.HashMap;

public class hash_map {

	public static void main(String[] args) {
		HashMap<String, Integer> _hm = new HashMap<String, Integer>();
		String Data[] = "stated the programming learning".replace(" ", "").split("");
		for (int i = 0; i < Data.length; i++) {
			_hm.put(Data[i], _hm.get(Data[i]) == null ? 1 : _hm.get(Data[i]) + 1);
		}

		System.out.println("|> - " + _hm);
		System.out.println("|> - " + _hm.keySet());
	}

}
