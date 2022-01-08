package week8;
public class Student implements Cloneable{
		String name;
		Birthday birthday;
		Student(String name, Birthday birthday) {
	        this.name = name;
	        this.birthday = birthday;
}
		@Override
		public String toString() {
			return "[name is " + name + ", "+ birthday + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Birthday getBirthday() {
			return birthday;
		}
		public void setBirthday(Birthday birthday) {
			this.birthday = birthday;
		}
		public Object clone() throws CloneNotSupportedException{
			Student studentClone = (Student)super.clone();
			studentClone.birthday =(Birthday) birthday.clone() ;
			return studentClone;
		}
}
