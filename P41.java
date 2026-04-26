class SumThread extends Thread {
	int start, end;
	long sum = 0;
	SumThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public void run() {
		for (int i = start; i <= end; i++) {
			sum += i;
 		}
 	}
 	long getSum() {
 		return sum;
 	}
}

class ParallelSumDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Preksha Patel");
		System.out.println("240390107031");
		SumThread t1 = new SumThread(1, 1000);
		SumThread t2 = new SumThread(1001, 2000);
 		t1.start();
		t2.start();
 		t1.join();
 		t2.join();
		long total = t1.getSum() + t2.getSum();
 		System.out.println("Final Sum = " + total);
 	}
}