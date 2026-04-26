package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {

    public static void main(String[] args) {
	System.out.println("Preksha Patel");
        System.out.println("240390107031");
        B b = new B(1, 2, 3);
        C c = new C();

        b.display();
        System.out.println();
        c.display();
    }
}