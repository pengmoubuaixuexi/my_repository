package work10;

public class Car {
	String name;
	int numberOfDoors=4;
	Door[] doors;
	Car(String name , int numberOfDoors) throws BadDoorException{
		if(numberOfDoors<1) {
			throw new BadDoorException("A car at least must hava one door");
		}
		else {
			doors= new Door[numberOfDoors];
			for(int i = 0; i < doors.length; i++) {
				doors[i] = new Door();
		}
		this.name = name;
		this.numberOfDoors = numberOfDoors;
}}
	void listDoors() {
		for (int i = 0;i<numberOfDoors;i++)
		System.out.println(name+": door is "+doors[i].printIsOpen());
	}
	int  countOpenDoors() {
		int count = 0;
		for(int i = 0;i<numberOfDoors;i++) {
		if(doors[i].printIsOpen())
			count++;}
		return count;
	}
	void openOneDoor(int index){
		if(index-1>numberOfDoors) {
		System.out.println("Door"+index+"does not exist");}
		else
			doors[index-1].open();
		}
	
	class BadDoorException extends Exception{
		public BadDoorException(String msg) {
			super(msg);
		}
		class BadCarException extends Exception{
			public BadCarException(String msg) {
				super(msg);
			}
		}
		
	}
	public static void main(String args[]) throws BadDoorException{
		try{Car car = new Car("彭涛",0);
		int OpenDoor = car.countOpenDoors();
		car.openOneDoor(3);
		car.listDoors();}catch(Exception e) {//用catch(exception e)是为了捕捉所有异常，如果用door的就捕捉不了car的了；
			System.out.println(e);
		}
	}
	}
