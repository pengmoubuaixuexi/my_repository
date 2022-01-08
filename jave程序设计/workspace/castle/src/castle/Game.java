package castle;

import java.util.*;

public class Game {
	private Room currentRoom;
	public Game() {
		creatRooms();
	}
	public void creatRooms() {
		Room outside,lobby,pub,study,bedroom;
		outside = new Room("城堡外");
		lobby = new Room("大堂");
		pub = new Room("小酒吧");
		study = new Room("书房");
		bedroom = new Room("卧室");
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
		System.out.println("欢迎来到城堡！");
		System.out.println("这是一个超级无聊的游戏。");
		System.out.println("如果需要帮助，请输入‘help’。");
		System.out.println();
		showPrompt();
	}
	private void printHelp() {
		System.out.print("迷路了吗？你可以做的命令有：go bye help");
		System.out.println("如：\tgo east");
	}
	
	private void goRoom(String direction) {
		Room nextRoom=  currentRoom.getExit(direction);
		
		if(nextRoom==null) {
			System.out.println("那里没有门！");
		}
		else {
			currentRoom= nextRoom;
	        showPrompt();
		}
	}
	public void showPrompt() {
		System.out.println("你在"+currentRoom);
		System.out.println("出口有：");
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
		System.out.println("感谢您的光临。再见！");
		in.close();
	}
 
}
