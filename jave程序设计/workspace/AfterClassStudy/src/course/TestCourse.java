package course;

import java.util.Scanner;

public class TestCourse {

	public static void main(String[] args) {
		Scanner studentInput = new Scanner(System.in);
		System.out.println("请输入多少个学生");
		int n=studentInput.nextInt();
		studentInput.nextLine();
		Course course1 = new Course("MathematicalAnalysis",n);
		for(int i=0;i<n;i++) {
			System.out.println("请输入第"+(i+1)+"个学生的名字");
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
