package castle;

import java.util.*;

public class Game {
	private Room currentRoom;
	public Game() {
		creatRooms();
	}
	public void creatRooms() {
		Room outside,lobby,pub,study,bedroom;
		outside = new Room("�Ǳ���");
		lobby = new Room("����");
		pub = new Room("С�ư�");
		study = new Room("�鷿");
		bedroom = new Room("����");
		outside.setExit("east", lobby);
		outside.setExit("south", study);
		outside.setExit("west", pub);
		lobby.setExit("west", outside);
		pub.setExit("east",outside);
		study.setExit("north",outside);
		study.setExit("east",bedroom);
		bedroom.setExit("west", study);
		lobby.setExit("up", pub);
		pub.setExit("down",lobby);
		currentRoom = outside;
	}
	public void printWelcome() {
		System.out.println();
		System.out.println("��ӭ�����Ǳ���");
		System.out.println("����һ���������ĵ���Ϸ��");
		System.out.println("�����Ҫ�����������롮help����");
		System.out.println();
		showPrompt();
	}
	private void printHelp() {
		System.out.print("��·������������������У�go bye help");
		System.out.println("�磺\tgo east");
	}
	
	private void goRoom(String direction) {
		Room nextRoom=  currentRoom.getExit(direction);
		
		if(nextRoom==null) {
			System.out.println("����û���ţ�");
		}
		else {
			currentRoom= nextRoom;
	        showPrompt();
		}
	}
	public void showPrompt() {
		System.out.println("����"+currentRoom);
		System.out.println("�����У�");
		System.out.println(currentRoom.getExitDesc());
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Game game = new Game();
		game.printWelcome();
		while(true) {
			String line = in.nextLine();
			String[] words = line.split(" ");
			if(words[0].equals("help")) {
				game.printHelp();
			}
			else if(words[0].equals("go")) {
				game.goRoom(words[1]);
			}
			else if(words[0].equals("bye")) {
				break;
			}
			
		}
		System.out.println("��л���Ĺ��١��ټ���");
		in.close();
	}
 
}
