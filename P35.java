class AverageApp {
	static double average(String[] values) throws NullPointerException,
	NumberFormatException {
 		double sum = 0;
 		for (int i = 0; i < values.length; i++) {
 			if (values[i] == null) {
 				throw new NullPointerException("Null value found");
 			}
 			double num = Double.parseDouble(values[i]);
 			sum += num;
		}
 		return sum / values.length;
 	}
 
	public static void main(String[] args) {
	 	System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		String[] valid = {"10", "20", "30"};
 		String[] invalidNumber = {"10", "abc", "30"};
 		String[] nullValue = {"10", null, "30"};
 	
		try {
 			System.out.println("Average (Valid): " + average(valid));
 		}
 		catch (Exception e) {
 		} 
		finally {
			System.out.println("Process completed\n");
 		}
 
		try {
 			System.out.println("Average (Invalid Number): " + average(invalidNumber));
 		}
 		catch (Exception e) {
 			System.out.println("Exception: " + e);
 		}
 		finally {
 			System.out.println("Process completed\n");
 		}
 
		try {
 			System.out.println("Average (Null Value): " + average(nullValue));
		}
 		catch (Exception e) {
 			System.out.println("Exception: " + e);
 		}
 		finally {
 			System.out.println("Process completed\n");
 		}
 	}
}