import java.io.*;
class StudentFile {
 	public static void main(String[] args) {
 		System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		FileWriter fw = null;
 		BufferedReader br = null;
 		try {
 			fw = new FileWriter("students.txt");
 			fw.write("101 Preksha 85\n");
 			fw.write("102 Vrunda 78\n");
 			fw.write("103 Appu 90\n");
 			fw.close();
 			br = new BufferedReader(new FileReader("students.txt"));
 			String line;
 			System.out.println("Student Records:\n");
			while ((line = br.readLine()) != null) {
 				System.out.println(line);
 			}
 		} catch (IOException e) {
 			System.out.println("Error: " + e);
 		} finally {
 			try {
 				if (fw != null) fw.close();
 				if (br != null) br.close();
 			} catch (IOException e) {
 				System.out.println("Error closing file");
			}
		}
	}
}