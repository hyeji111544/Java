package sub4;

/*
 *  날짜 : 2024/01/03
 *  이름 : 윤혜지
 *  내용 : Java 상속 실습하기
 */
public class InheritanceTest {
	public static void main(String[] args) {
		
		// Car 상속개체 생성
		Sedan sonata = new Sedan ("소나타", "흰색", 0, 2000);
		sonata.speedup(80);
		sonata.speedTurbo();
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedup(60);
		bongo.show();
		
		StockAccount kb = new StockAccount("KB증권","101-12-1011","홍길동",1000000,"삼성전자",0,0);
		kb.deposit(1000000);
		kb.buy(10, 50000);
		kb.sell(5, 50000);
		kb.show();
	}

}
