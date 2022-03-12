package ch10;

public class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			if(0 < day && day < 32) {
				isValid = true;
				this.day = day;
			}
			else {
				isValid = false;
			}
			break;
		case 2:
			if(0 < day && day < 29) {
				isValid = true;
				this.day = day;
			}
			else {
				isValid = false;
			}
			break;
		case 4: case 6: case 9: case 11:
			if(0 < day && day < 31) {
				isValid = true;
				this.day = day;
			}
			else {
				isValid = false;
			}
			break;
		}
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
	public boolean getIsValid() {
		return isValid;
	}
}
