package sub1;


import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\java\\Desktop\\Test1.txt";
		String target = "C:\\Users\\java\\Desktop\\Test2.txt";
		
		
		try {
			//스트림 생성(연결)
			FileReader fr = new FileReader(source);
			FileReader fw = new FileReader(target);
			
			while(true) {
				// 파일 읽기
				int data = fr.read();
				if(data == -1) {
					//파일 모두 읽었을 때 반복 종료
					break;
				}
				
				char ch = (char) data;//아스키 코드로 읽은 것을 영어로 전환
				
				System.out.print(ch);
				
				//파일쓰기
				//fw.write(ch);
			}
			
			//스트림 해제
			fr.close();
			fw.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n프로그램 종료...");
	}



	}


