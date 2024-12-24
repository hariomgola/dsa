package dsa_hash;

public class hash_function {

	public static void main(String[] args) {
		String dataForHash = "hariomgola";
		int sum = 0;
		for (int i = 0; i < dataForHash.length(); i++) {
			sum += dataForHash.charAt(i);
			System.out.println(" | > - Hash value = " + sum);
		}
		System.out.println(">- Final Hash Value - " + (sum % 10));
	}

}
