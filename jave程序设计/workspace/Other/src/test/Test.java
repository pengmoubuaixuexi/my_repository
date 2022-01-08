package test;

class f{
	String name = "null";
	void pa(){
		System.out.println("f");}
	void pb(){
			System.out.println("f");
	}
}
class s extends f {
	double name = 1;
	void pa() {
		System.out.println("s");
	}
	void pc() {
		System.out.println("s");
	}
}
public class Test {
	
		public static void main(String args[]) {
				f f = new s();
				f.pa();
				f.pb();
				System.out.println(f.name);
				s s1 = (s)f;
				s1.pa();
				s1.pb();
				s1.pc();
				System.out.println(s1.name);
		}
}
