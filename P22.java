class shape{
 double d1,d2;

 void getdata(double d1,double d2){
    this.d1=d1;
    this.d2=d2;
 }
}

 class Triangle extends shape{

  double area(){
    return 0.5*d1*d2;
  
  }
 }


class Rectangle extends shape{

    double area(){
        return d1*d2;
    }
}

public class P22{
    public static void main(String[] args){
      System.out.println("Preksha Patel");
      System.out.println("240390107031");
      Triangle t1 = new Triangle();
      t1.getdata(10,5);
      System.out.println("triangle area:" +t1.area());
      Rectangle r1 = new Rectangle();
     r1.getdata(8,4);
      System.out.println("rectangle area:" +r1.area());

    }
}