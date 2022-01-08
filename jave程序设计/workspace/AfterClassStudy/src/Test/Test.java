package Test;

import java.util.Random;

public class Test {
	public static void main(String args[]) {
		char[] chars=Arrarylist();
		int[] count=new int[26];
		for(int i=0;i<chars.length;i++)
			count[chars[i]-'a']++;
		System.out.println("这是产生的随机英文字母");
		for(char one:chars)
			System.out.print(" "+one);
		System.out.println("这是每个字母出现了多少次");
		for(int i=0;i<count.length;i++)
			System.out.print(" "+count[i]+(char)(i+'a'));
		
}
public static  char[] Arrarylist(){
	char [] arrarylist=new char[100];
	for(int i=0;i<arrarylist.length;i++)
		arrarylist[i]=RandomCharacter.getRandomLowerCaseLetter();
		return arrarylist;
}
public static class RandomCharacter {

    //生成一个介于ch1 和 ch2 的随机字母

    public static char getRandomCharacter(char ch1, char ch2) {

        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    //生成一个随机的小写字母

    public static char getRandomLowerCaseLetter() {

        return getRandomCharacter('a', 'z');

    }

}}