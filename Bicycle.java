
public class Bicycle {
public static void main(String[] args) {
	
	Bike bike=new Bike();
	bike.speed=10;
	bike.gear=18;
	Bike.numberofBike=1;
	bike.informationPrint();
	System.out.println("************");
	Bike bike2=new Bike();
	bike2.speed=20;
	bike2.gear=12;
	Bike.numberofBike=2;
	bike2.informationPrint();
	//System.out.println(bike.gear);
	
}
}
//Bike.java


//public class Bike {
//int speed;
//int gear;
//
//static int numberofBike=0;
//
//void informationPrint() {
//	System.out.println(gear);
//	System.out.println(speed);
//	System.out.println(Bike.numberofBike);
//}
//}
