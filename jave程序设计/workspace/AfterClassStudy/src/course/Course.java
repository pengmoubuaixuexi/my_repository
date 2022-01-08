package course;

public class Course {
	String courseName;
	String[] students;
	int numberOfStudents ;
	public Course(String courseName,int numberOfStudents) {
		super();
		this.numberOfStudents=numberOfStudents;
		this.courseName = courseName;
		students = new String[numberOfStudents];
		for(int i =0;i<students.length;i++)
		students[i] = new String();
	}
	public String getCourseName() {
		return courseName;	
}	
	public void addStudent(String student) {
		numberOfStudents++;
		String[] newStudents = new String[numberOfStudents];
		System.arraycopy(students, 0, newStudents,0, numberOfStudents-1);
		newStudents[numberOfStudents-1] = student;
		students = newStudents;
	}
	public void dropStudent(String student) {
		String[] newStudents = new String[numberOfStudents-1];
		for(int i=0;i<numberOfStudents;i++)
		if(students[i].equals(student)) {
			numberOfStudents-=1;
		System.arraycopy(students,0,newStudents,0,i);
		System.arraycopy(students, i+1, newStudents, i, numberOfStudents-i);
		students = newStudents;
		}
				
	}
	public void getStudents() {
		for( int i = 0;i<numberOfStudents;i++)
			System.out.println("student"+(i+1)+":"+students[i]);
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void clear() {
		for(int i = 0;i<numberOfStudents;i++) {
			students[i]="null";
		}
		numberOfStudents = 0;
	}
}