class P12{
	int x;
	int y;

	P12(){
		x = 5;
		y = 5;
	}

	P12(int a, int b){
		x = a;
		y = b;
	}

	P12(P12 P){
		x = P.x;
		y = P.y;
	}

	void Display(){
		System.out.println("Point :(" + x + ", " + y + ")");
	}

	public static void main(String []args){
		P12 P1 = new P12();
		P12 P2 = new P12();
		P12 P3 = new P12();

		P1.Display();
		P2.Display();
		P3.Display();
	}
}