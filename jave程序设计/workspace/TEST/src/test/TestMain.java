package test;

import java.util.Scanner;

public class TestMain {

		public static void main(String[] args) {
			System.out.println("Rules are as follows:");
			System.out.println("1----Fist; 2----Dishcloth; 3----Scissors");
			System.out.println("When you or computer wins 2 times, game over.");
			System.out.println("----------------------------------------------------------");
			String youShow = "";//user
			String comShow = "";//computer
			//一开始要给字符串定义个随便什么，后面可以再赋！！！不然字符串没被定义
			int count1 = 0, count2 = 0;//1:you win, 2:computer win
			Scanner input = new Scanner(System.in);
			while(true)
			{
				System.out.println("Please show your gesture:");
				int you = input.nextInt();
				int com = ((int)(Math.random()*10))%3+1;//这是每次都要重新获得一遍的！！！
				// com = ((int)(Math.random()*10))/3  will appear "0",can't go to switch
			switch(you)
			{
			case 1:
				youShow = "Fist";
			    break;
			case 2:
				youShow = "Dishcloth";
				break;
			case 3:
				youShow = "Scissors";
				break;
			}
	       switch(com)
		{
	        case 1:
	        	comShow = "Fist";
	        	break;
	        case 2:
	        	comShow = "Dishcloth";
	        	break;
	        case 3:
	        	comShow = "Scissors";
	        	break;
		}
	      //System.out.println(youShow+","+comShow);//测试你我出拳（√）
	       if(you == com)//draw
	    	   System.out.println("Computer: "+comShow+" and you: "+youShow+" ,it ends in a draw.");
	       else//first "if" :you win; second "if" :computer win
	       {
	    	   if((you == 1 && com == 2) || (you == 2 && com == 3) || (you == 3 && com == 1))
	    	   {
	    		   System.out.println("Computer: "+comShow+" and you: "+youShow+" ,you lose~~");
	    		   count2++;
	    	   }
	    	   if((you == 1 && com == 3) || (you == 2 && com == 1) || (you == 3 && com == 2))
	    	   {
	    		   System.out.println("Computer: "+comShow+" and you: "+youShow+" ,you win!!");
	    		   count1++;
	    	   }
	       }
	       if(count1 ==2 || count2 ==2)//game over
	    	   break;
			}
			if(count1 == 2)//you win
			{
				System.out.println("Game is over.The result ↓");
				System.out.println("You win "+count1+" times,computer win "+count2+" times.You win!");
			}
			if(count2 == 2)//computer win
			{
				System.out.println("Game is over.The result ↓");
				System.out.println("You win "+count1+" times,computer win "+count2+" times.You lose~");
				
			}
	}
}
