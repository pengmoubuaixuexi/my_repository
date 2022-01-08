package work9;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dot dot = new Dot(0, 0);
			try {
				dot.resize(0);
			} catch (Exception e) {
				System.out.println(e);
			}
	}

}
