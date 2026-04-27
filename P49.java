import java.util.*;
class Box<T> {
 	ArrayList<T> items = new ArrayList<T>();
 	void addItem(T item) {
 		items.add(item);
	}
 	void displayItems() {
 		for (T item : items) {
 			System.out.println(item);
 		}
 	}
}

class BoxDemo {
 	public static void main(String[] args) {
 		System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		Box<String> nameBox = new Box<String>();
 		nameBox.addItem("Preksha");
 		nameBox.addItem("Vrunda");
 		nameBox.addItem("Appu");
 		System.out.println("Names:");
 		nameBox.displayItems();
 		Box<Integer> rollBox = new Box<Integer>();
 		rollBox.addItem(101);
 		rollBox.addItem(102);
 		rollBox.addItem(103);
		System.out.println("\nRoll Numbers:");
		rollBox.displayItems();
 	}
}