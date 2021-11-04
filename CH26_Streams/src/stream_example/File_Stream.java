package stream_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File_Stream {

	public static void main(String[] args) throws IOException {
		// lines 메소드는 파일을 읽어서 한줄씩 스트링으로 생성
		Files.lines(Paths.get("Dracula.txt")).forEach(System.out::println);
		
	}

}
