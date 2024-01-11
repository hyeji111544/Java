package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 날짜 : 2024/01/11
 * 이름 : 윤혜지
 * 내용 : Java 데이터 입출력 버퍼 보조 스트림 실습
 */
public class BufferIOTest {
	public static void main(String[] args) {
		

		String source = "C:\\Users\\java\\Desktop\\Java.zip";
		String target = "C:\\Users\\java\\Desktop\\JzvaCopy.zip";
		
		
		try {
			//스트림 생성(연결)
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조 스트림 생성(버퍼)
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				// 파일 읽기
				int data = bis.read();
				
				if(data == -1) {
					//파일 모두 읽었을 때 반복 종료
					break;
				}
				
				// char ch = (char) data;//아스키 코드로 읽은 것을 영어로 전환
				// System.out.print(ch);
				
				//파일쓰기
				bos.write(data);
			}
			
			//스트림 해제
			bos.flush(); //버퍼 비우기
			
			bis.close();
			bos.close();
			
			fis.close();
			fos.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n프로그램 종료...");
	}


	}

