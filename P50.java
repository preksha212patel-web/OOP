import java.util.*;
class GenericSearch {
 	public static <T> boolean searchElement(LinkedList<T> list, T element) {
 	return list.contains(element);
 	}

 	public static void main(String[] args) {
 		System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		LinkedList<Integer> rollList = new LinkedList<Integer>();
 		rollList.add(101);
 		rollList.add(102);
 		rollList.add(103);
 		System.out.println("Searching Roll Number 102: " + searchElement(rollList, 102));
 		System.out.println("Searching Roll Number 105: " + searchElement(rollList, 105));
 		LinkedList<String> nameList = new LinkedList<String>();
 		nameList.add("Appu");
 		nameList.add("Pree");
 		nameList.add("Vrunda");
 		System.out.println("\nSearching Name 'Appu': " + searchElement(nameList, "Appu"));
 		System.out.println("Searching Name 'Vrunda': " + searchElement(nameList, "Vrunda"));
 	}
}