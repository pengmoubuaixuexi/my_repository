package test;
class FatherClass {
public int value;
public void f() {
value=100;
System.out.println("�����value����ֵ="+value);
}
}
/**
* ����ChildClass�Ӹ���FatherClass�̳�
*/
class ChildClass extends FatherClass {
/*������˼̳и��������е�valu�����⣬�Լ�������������һ��value���ԣ�
Ҳ����˵����ʱ������ӵ������value���ԡ�
*/
public int value;
/**
������ChildClass������д�˴Ӹ���̳�������f()���������ʵ�֣�����д��f()�����ķ����塣
*/
public void f() {
super.f();//ʹ��super��Ϊ�����������ö��������ø�����������f()����
value=200;//���value�������Լ�������Ǹ�valu�����ǴӸ���̳��������Ǹ�value
System.out.println("�����value����ֵ="+value);
System.out.println(value);//��ӡ�������������Զ�����Ǹ�value��ֵ�����ֵ��200
/**
* ��ӡ�������Ǹ��������valueֵ��������������д�Ӹ���̳�������f()����ʱ��
* ��һ�仰��super.f();�����ø����������ö�����ø�������f()������
* ���൱���������������Լ�����f()����ȥ�ı��Լ���value���Ե�ֵ����0����100��
* ���������ӡ������valueֵ��100��
*/
System.out.println(super.value);
}
}
public class TestInherit {
public static void main(String[] args) {
ChildClass cc = new ChildClass();
cc.f();
}
}