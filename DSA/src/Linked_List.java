import java.util.LinkedList;

public class Linked_List {
	LinkedList<String> language = new LinkedList<String>();

	public void arrayList_print() {
		System.out.print(" |> Data in ArrayList - ");
		System.out.println(language);
		System.out.println("------------------------------------------------------------------------------");
	}

	public void add() {
		language.add("Java");
		language.add("JavaScript");
		arrayList_print();
	}

	public void addFirst() {
		language.addFirst("C#");
		arrayList_print();
	}

	public void addLast() {
		language.addLast("Python");
		arrayList_print();
	}

	public void removeFirst() {
		language.removeFirst();
		arrayList_print();
	}

	public void removeLast() {
		language.removeLast();
		arrayList_print();
	}

	public void getFirst() {
		language.getFirst();
		arrayList_print();
	}

	public void getLast() {
		language.getLast();
		arrayList_print();
	}
}
