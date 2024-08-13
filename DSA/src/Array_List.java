import java.util.ArrayList;

public class Array_List {
	ArrayList<String> language = new ArrayList<String>();

	public void arrayList_print() {
		System.out.print(" |> Data in ArrayList - ");
		System.out.println(language);
		System.out.println("------------------------------------------------------------------------------");
	}

	public void add() {
		language.add("Java");
		language.add("JavaScript");
		language.add("Angular");
		language.add("React");
		language.add("Node");
		arrayList_print();
	}

	public void addIndex() {
		language.add(1, "AWS");
		arrayList_print();
	}

	public void accessItem() {
		System.out.print(" |> Item at 3 index - ");
		System.out.println(language.get(3));
		arrayList_print();
	}

	public void changeItem() {
		language.set(3, "Spring Boot");
		arrayList_print();
	}

	public void removeItem() {
		language.remove(3);
		arrayList_print();
	}

	public void size() {
		System.out.println(" Size of Array List " + language.size());
		arrayList_print();
	}

	public void clear() {
		language.clear();
		arrayList_print();
	}

	public void loop() {
		for (var i = 0; i < language.size(); i++) {
			System.out.println(" Item at " + i + " - " + language.get(i));
		}
		arrayList_print();
	}

	public void advanceLoop() {
		for (var i : language) {
			System.out.println(" Item - " + i);
		}
		arrayList_print();
	}
}
