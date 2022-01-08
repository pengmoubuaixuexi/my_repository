package week8;

public class Birthday implements Cloneable{
		int year;
		int month;
		int day;
		Birthday(int year,int month,int day){
			this.year = year;
			this.month = month;
			this.day = day;
		}
		@Override
		public String toString() {
			return "Birthday is "+year+"."+month+"."+day;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		public Object clone() {
			try {
				return super.clone();
			}catch(CloneNotSupportedException ex) {
				return null;
			}
}}
