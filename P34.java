class VotingApp {
	void checkEligibility(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Age must be 18 or above to vote");
		} else {
			System.out.println("Eligible to vote");
		}
	}
 
	public static void main(String[] args) {
 		System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		VotingApp v = new VotingApp();
 		int[] ages = {16, 20, 17, 25};
 		for (int age : ages) {
 			try {
 				System.out.println("Checking age: " + age);
 				v.checkEligibility(age);
 			}
 			catch (IllegalArgumentException e) {
 				System.out.println("Exception: " + e.getMessage());
 			}
 			finally {
 				System.out.println("Validation process completed\n");
 			}
 		}
 	}
}