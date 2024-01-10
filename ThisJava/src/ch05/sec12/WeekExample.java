package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		
		Week today = null; //Week 타입 변수 today 선언
		
		Calendar cal = Calendar.getInstance();
		//컴퓨터 날짜 및 시간 정보를 가진 Calendar 객체를 얻고 번지를 cal 변수에 대입.
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//일(1)~ 토(7)까지의 숫자를 얻고 week변수에 대입.
		
		switch(week) {
		case 1: today = Week.SUNDAY ;		break;
		case 2: today = Week.MONDAY ;		break;
		case 3: today = Week.TUESDAY ;		break;
		case 4: today = Week.WEDNESDAY ;	break;
		case 5: today = Week.THURSDAY ;		break;
		case 6: today = Week.FRIDAY ;		break;
		case 7: today = Week.SATURDAY ;		break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}

}
