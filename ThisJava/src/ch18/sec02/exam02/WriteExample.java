package ch18.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		
		
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");
			
			byte[] array = {10, 20, 30};
			
			//배열의 모든 바이트를 출력
			os.write(array);
			
			os.flush();
			os.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
