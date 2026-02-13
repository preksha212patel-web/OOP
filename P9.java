class P9{
   double height,width;
   
	P9(){
	height=1;
	width=1;
	}   
      
	P9(double h,double w){
	height=h;
	width=w;
	}

	double getArea()
	{
	return width*height;
}

	double getPerimeter()
	{
	return 2*(width+height);
}

     public static void main(String args[]){
 
        P9 a= new P9();
	System.out.println("****************");
	System.out.println("  rectangle 1");
	System.out.println("****************");
	System.out.println("Height:"+a.height);
	System.out.println("Width:"+a.width);
	System.out.println("Area:"+a.getArea());
	System.out.println("Perimeter:"+a.getPerimeter());
	System.out.println("");

	P9 b= new P9(13,10);
	System.out.println("****************");
	System.out.println("  rectangle 2");
	System.out.println("****************");
	System.out.println("Height:"+b.height);
	System.out.println("Width:"+b.width);
	System.out.println("Area:"+b.getArea());
	System.out.println("Perimeter:"+b.getPerimeter());

	
}
}