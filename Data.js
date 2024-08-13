const exportData = {
  "Introduction To DSA": introductionToDSA,
  "Array List": arrayList,
  "Linked List": linkedList,
  "Sorting List": sortingList,
};
const introductionToDSA = () => `
# Introduction to DSA (Data Structure and Alogorithm)
  - Arrays
  - Arrays List
  - Linked List
  - Stack and Queue
  - Hash
       |- Hash Table 
       |- Hash Sets
       |- Hash Map
  - Tree
  - Graph
`;
const arrayList = () => `
# ArrayList
  - Arraylist belongs to the class of resizable array.
  - The Main advantage of array list is that its size can be dynamic.

# ArrayList Creation
  - ArrayList<String> language = new ArrayList<String>();
                        or 
  - ArrayList<class_object> language = new ArrayList<class_object>();

# ArrayList Printing 
 ------------------------------------------------------
 |  public void arrayList_print() {                   |
 |    System.out.print(" |> Data in ArrayList - ");   |
 |	  System.out.println(language);                   |
 |	  System.out.println("   XXXXX    ");             |
 |  }                                                 |
 ------------------------------------------------------

# Adding the List
 -------------------------------------------------------
 |  public void add() {                                |
 |     language.add("Java");                           |
 |     language.add("JavaScript");                     |
 |     language.add("Angular");                        |
 |     language.add("React");                          |
 |     language.add("Node");                           |
 |     arrayList_print();                              |
 |  }                                                  |
 -------------------------------------------------------

# Adding into the index
 -------------------------------------------------------
 |  public void addIndex() {                           |
 | 	language.add(1, "AWS");                            |
 | 	arrayList_print();                                 |
 |  }                                                  |
 -------------------------------------------------------

# Access Item
 -------------------------------------------------------
 |  public void accessItem() {                         |
 |    System.out.print(" |> Item at 3 index - ");      |
 |    System.out.println(language.get(3));             |
 |    arrayList_print();                               |
 |  }                                                  |
 -------------------------------------------------------

# Change Item
 -------------------------------------------------------
 |  public void changeItem() {                         |
 |    language.set(3, "Spring Boot");                  |
 |    arrayList_print();                               |
 |  }                                                  |
 -------------------------------------------------------

# Remove Item
 -------------------------------------------------------
 |  public void removeItem() {                         |
 |    language.remove(3);                              |
 |    arrayList_print();                               |
 |  }                                                  |
 -------------------------------------------------------

# Size
 --------------------------------------------------------------------
 |  public void size() {                                            |
 |    System.out.println(" Size of Array List " + language.size()); |
 |    arrayList_print();                                            |
 |  }                                                               |
 ------------------------------------------------------------------- 

# Clear ArrayList
 -------------------------------------------------------
 |  public void clear() {                              |
 |    language.clear();                                |
 |    arrayList_print();                               |
 |  }                                                  |
 -------------------------------------------------------
`;
const linkedList = () => `
# LinkedList
 - Linked List is Simmilar to the functionality of Array List and support all functions of arrayList.

# Difference B/w Linked List and Array List
  - Array List 
      |> ArrayList class has the regular array inside same. 
      |> When An element is added into list if size of array is less. It will declare new array with greater length.
      |> Then new array will be replaced with existing array.

  - Linked List
      |> Linked List store the items in form of container.
      |> Each container is linked to the next container in the list.
      |> When the new element is added it should be placed in conatiner and linked to new container.

# Add First
 ------------------------------------
 |  public void addFirst() {        |
 |    language.addFirst("C#");      |
 |    arrayList_print();            |
 |  }                               |
 ------------------------------------
# Add Last
 ------------------------------------
 |  public void addLast() {         |
 |    language.addLast("Python");   |
 |    arrayList_print();            |
 |  }                               |
 ------------------------------------
# Remove First
 ------------------------------------
 |  public void removeFirst() {     |
 |    language.removeFirst();       |
 |    arrayList_print();            |
 |  }                               |
 ------------------------------------
# Remove Last
 ------------------------------------
 |  public void removeLast() {      |
 |    language.removeLast();        |
 |    arrayList_print();            |
 |  }                               |
 ------------------------------------
# Get First
 ------------------------------------
 |  public void getFirst() {        |
 |    language.getFirst();          |
 |    arrayList_print();            |
 |  }                               |
 ------------------------------------
# Get Last
 ------------------------------------
 |  public void getLast() {         |
 |    language.getLast();           |
 |    arrayList_print();            |
 |  }                               |
 ------------------------------------
`;
const sortingList = () => ``;
