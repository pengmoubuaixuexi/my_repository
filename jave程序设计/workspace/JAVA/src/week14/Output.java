package week14;

public class Output {
	char[] str = new char[4];
		Output(){
			for(int i = 0;i<str.length;i++) {
			int j = (int)((Math.random())*62+48);
			if(j<58) {
				str[i] = (char) j;
			}
			else if(j>=58&&j<=83) {
				str[i] = (char) (j+7);
			}
			else {
				str[i] = (char) (j+13);
			}
			}
		}
		public String toString() {
			String str1 = String.valueOf(str);
			return str1;
		}
}
