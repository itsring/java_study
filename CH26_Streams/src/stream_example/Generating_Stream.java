package stream_example;

import java.util.stream.Stream;

public class Generating_Stream {

	public static void main(String[] args) {
		// Strea.of()를 사용해 간단하게 스트림 생성
		Stream.of(1, 2, 3).forEach(System.out::println);
		Stream.of("하나", "둘", "셋").forEach(System.out::println);

		// Stream.generater/람다식으로 생성
		Stream.generate(() -> "Hello").limit(5).forEach(System.out::println);
	}

}
