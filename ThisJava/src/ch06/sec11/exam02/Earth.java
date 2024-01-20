package ch06.sec11.exam02;
/*
 * 불변의 값을 저장하는 필드를 상수라고 부른다.
 * 상수는 객체마다 저장할 필요가 없고, 여러개의 값을 가져도 안되기 때문에
 * static 이면서 final 인 특성을 가져야한다.
 */

public class Earth {
	
	//상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	//상수 선언
	static final double EARTH_SURFACE_AREA;
	
	//정적 블록에서 상수 초기화 (Math.PI 는 자바에서 제공하는 상수)
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; 
	}

}
