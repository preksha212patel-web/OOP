import java.util.*;
class GenericSort {
 	public static <T extends Comparable<T>> void sortList(List<T> list) {
 		Collections.sort(list);
 	}
 
	public static void main(String[] args) {
 		System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		ArrayList<Integer> numbers = new ArrayList<Integer>();
 		numbers.add(45);
 		numbers.add(12);
 		numbers.add(78);
 		numbers.add(23);
 		System.out.println("Numbers before sorting:");
 		System.out.println(numbers);
 		sortList(numbers);
 		System.out.println("Numbers after sorting:");
 		System.out.println(numbers);
 		ArrayList<String> names = new ArrayList<String>();
 		names.add("Vrunda");
 		names.add("Pree");
 		names.add("Prachi");
 		names.add("Preksha");
 		System.out.println("\nNames before sorting:");
 		System.out.println(names);
 		sortList(names);
		System.out.println("Names after sorting:");
		System.out.println(names);
	}
}