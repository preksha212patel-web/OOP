import java.io.*;
class FileStats {
	public static void main(String[] args) {
 		System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		int lineCount = 0;
 		int wordCount = 0;
 		int charCount = 0;
 		try {
 			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
 			String line;
 			while ((line = br.readLine()) != null) {
 				lineCount++;
 				String[] words = line.trim().split("\\s+");
 				if (line.trim().length() > 0)
	 			wordCount += words.length;
 				for (int i = 0; i < line.length(); i++) {
 					if (line.charAt(i) != ' ')
 					charCount++;
 				}
 			}
 			br.close();
 			System.out.println("Lines: " + lineCount);
 			System.out.println("Words: " + wordCount);
 			System.out.println("Characters (excluding spaces): " + charCount);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error reading file");
 		}
 	}
}