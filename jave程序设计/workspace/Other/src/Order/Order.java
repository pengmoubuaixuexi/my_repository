package Order;

import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Order {
    private String payType;
    private String time;//��������
    private Shop shop;
    private static int numOrder = 0;
    private Product2[] pro2= {new Product2("�ɿ������θ�",24.6),new Product2("֥ʿ�����", 16.0),new Product2("ԭζ�̲�",9.0)};

    public Order() {this.numOrder++;}//�޲ι��캯��
    
    public Order(String payType, Shop shop)//�е��ź�֧����ʽ
    {
    	this.numOrder++;//���۵��õ����޲λ����вΣ����Ŷ���++
    	this.payType = payType;
    	this.shop = shop;
    	Date date = new Date();//�����ɶ�����ʱ��
    	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd/HH:mm");
    	this.time = sdf.format(date);  
    } 
    public String toString()//û����shop��product����Ϣ
    {
    	return ("���ţ�"+this.numOrder+"\n"+"��������ʱ�䣺"+this.time+"\n"+"֧����ʽ��"+this.payType);
    }
    
    public void print()//��ӡ���������̼ҵ���Ϣ����������Ʒ��
    {
    	System.out.println(this);
    	System.out.println(this.shop);
    }
   public void print(String s, int num)//��ӡ�ָ���
    {
    	for(int i = 0; i<num; i++)
    		System.out.print(s);
    	System.out.println("");
    }

   public void printAll()//��ӡ�˵�
    {
    	System.out.println("��Ʒ��"+"\t\t"+"���ۡ�");
    	for(Product2 i : pro2)
    		System.out.println(i);
        System.out.println("012�ֱ������Ʒ���������������������Ʒ��������");
    }

   public void dianCan(String s)
    {
    	 String word[] = s.split(" ");
    	 if(word[0].equals("�ɿ������θ�"))//��ֻд��һ��������
    		 {
    		 System.out.print(pro2[0]+"x"+"�ݶ"+word[1]+"  �ܼ�:"+pro2[0].getZongJia(Integer.parseInt(word[1])));   		 
    		 }
    }

public static void main(String[] args) {
        Order o1 = new Order("΢��֧��", (new Shop()));
        o1.print();
        o1.printAll();//pro2��û���õ�main���õ�
        o1.print("-", 30);
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        o1.dianCan(words);}}