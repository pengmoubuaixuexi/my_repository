package Test;

import java.util.Random;

public class Test {
	public static void main(String args[]) {
		char[] chars=Arrarylist();
		int[] count=new int[26];
		for(int i=0;i<chars.length;i++)
			count[chars[i]-'a']++;
		System.out.println("���ǲ��������Ӣ����ĸ");
		for(char one:chars)
			System.out.print(" "+one);
		System.out.println("����ÿ����ĸ�����˶��ٴ�");
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

    //����һ������ch1 �� ch2 �������ĸ

    public static char getRandomCharacter(char ch1, char ch2) {

        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    //����һ�������Сд��ĸ

    public static char getRandomLowerCaseLetter() {

        return getRandomCharacter('a', 'z');

    }

}}