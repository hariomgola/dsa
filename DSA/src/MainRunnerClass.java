
public class MainRunnerClass {

	public static void main(String[] args) {
		// arrayList();
		linkedList();
	}

	public static void arrayList() {
		Array_List ar = new Array_List();
		ar.add();
		ar.addIndex();
		ar.accessItem();
		ar.changeItem();
		ar.removeItem();
		ar.size();
		ar.loop();
		ar.advanceLoop();
		ar.clear();
	}

	public static void linkedList() {
		Linked_List ls = new Linked_List();
		ls.add();
		ls.addFirst();
		ls.addLast();
		ls.removeFirst();
		ls.removeLast();
		ls.getFirst();
		ls.getLast();
	}
	
	public static void tree() {
		Tree tree = new Tree();
	}
}
