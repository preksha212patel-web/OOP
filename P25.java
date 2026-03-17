class Vehicle{

     protected String vehicalname;
     protected String brand;
    protected String fuelname;


    Vehicle(String vn , String b , String fn){
        vehicalname = vn;
        brand = b;
        fuelname = fn;
    }

    void displayDetails(){
        System.out.println("Preksha Patel");
        System.out.println("240390107031");
        System.out.println("vehical name is :" +vehicalname);
        System.out.println("brand is :"+ brand);
        System.out.println("fuelname is " +fuelname);
       
    }
}

class car extends Vehicle{
     protected int numberofseats;
    protected boolean ac_avilable;

  car(String vn , String b, String fn, int ns , boolean ac){
    super(vn , b ,fn);
    numberofseats = ns;
    ac_avilable = ac;
  }

    void displayDetails(){
        System.out.println("number of seats in car is :" +numberofseats);
        System.out.println(" ac is avilable or not"  +ac_avilable);
        super.displayDetails();
    }
}

class Electriccar extends car{
    double batterycapacity;
    double chargingtime;

Electriccar(String vn , String b, String fn, int ns , boolean ac, double battery,double time){

    super(vn , b, fn,ns ,ac);
    batterycapacity = battery;
    chargingtime = time;
}
     void displayDetails(){
        super.displayDetails();
        System.out.println("batterycapacity :" +batterycapacity);
        System.out.println("charging time is" +chargingtime);
     }
}

public class P25{
    public static void main(String[] args){

        Vehicle obj1 = new Vehicle("GJ01AB" ,"TATA ", "Petrol");
        obj1.displayDetails();
         System.out.println(" ");


        car obj2 = new car("GJ02ABC" , "mahindra" , "diesel" , 4 , true);
        obj2.displayDetails();
        System.out.println(" ");

        Electriccar obj3 = new Electriccar("GH10ABCD" , "tesla" , "ELECTRIC",5,true,73 ,1.8);
        obj3.displayDetails();
        System.out.println(" ");

        Vehicle v1 = new car("GJ02ABC" , "mahindra" , "diesel" , 4 , true);
        v1.displayDetails();
        System.out.println(" ");

        if(v1 instanceof car){
            car c1 =(car) v1;
            System.out.println("downcasting succesful :");
        }
    }
}