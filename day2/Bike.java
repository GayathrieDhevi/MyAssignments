package week1.day2;

public class Bike {
	public void myCar() {
		Car myCar=new Car();
		myCar.driveCar();
		myCar.applyBreak();
		myCar.soundHorn();
	}
	public static void main(String[] args) {
//ClassName objectName = new className() or constructor();
		Bike myBike=new Bike();		
		myBike.myCar();
		
	}
}
