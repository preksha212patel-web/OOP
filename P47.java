import java.util.*;
class WordFrequency {
 	public static void main(String[] args) {
 		System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter a sentence: ");
 		String input = sc.nextLine();
 		String[] words = input.split("\\s+");
 		HashMap<String, Integer> map = new HashMap<String, Integer>();
 		for (String word : words) {
 			if (map.containsKey(word)) {
 				map.put(word, map.get(word) + 1);
 			} else {
 				map.put(word, 1);
 			}
 		}
 		System.out.println("\nWord Frequency:");
 		for (String key : map.keySet()) {
 			System.out.println(key + " -> " + map.get(key));
 		}
 	}
}