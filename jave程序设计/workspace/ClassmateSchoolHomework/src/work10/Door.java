package work10;

public class Door {
	boolean isOpen ;
	Door(){
		isOpen = false;
	}
	public boolean printIsOpen() {
		return isOpen;
	}
	public void open() {
		isOpen = true; 
	}
	public void close() {
		isOpen = false;
	}
	public void testDoor() {
		Door d = new Door();	
		System.out.println(d.printIsOpen() == false);
		d.close();
		System.out.println(d.printIsOpen() == false);
		d.open();
		System.out.println(d.printIsOpen() == true);
		d.open();
		System.out.println(d.printIsOpen() == true);
		d.close();
		System.out.println(d.printIsOpen() == false);
	}
}
