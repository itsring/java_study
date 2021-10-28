package reading_writing_txt;

import java.io.File;

public class App2 {
	public static void main(String[] args) {
		//파일의 절대경로를 문자열로 표시(\\로 표시됨)
		String fileLocation = "E:\\JAVA\\java-study\\CH21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists()); //파일이 있으면 true 없으면 false로 리턴
	}

}
