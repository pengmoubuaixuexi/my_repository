package course;

import java.util.Scanner;

public class TestCourse {

	public static void main(String[] args) {
		Scanner studentInput = new Scanner(System.in);
		System.out.println("��������ٸ�ѧ��");
		int n=studentInput.nextInt();
		studentInput.nextLine();
		Course course1 = new Course("MathematicalAnalysis",n);
		for(int i=0;i<n;i++) {
			System.out.println("�������"+(i+1)+"��ѧ��������");
		course1.students[i] = studentInput.nextLine();
	}
		System.out.println(course1.getCourseName());
		course1.getStudents();
		System.out.println(course1.getNumberOfStudents());
		course1.addStudent("hello");
		course1.dropStudent("happy");
		System.out.println(course1.getCourseName());
		course1.getStudents();
		System.out.println(course1.getNumberOfStudents());
		studentInput.close();
}}
