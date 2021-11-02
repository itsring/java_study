package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) throws IOException {
		// 책파일을 불러와서 단어로 정렬, 출력
		File GreatGatsby = new File("GreatGatsby.txt");
		File wordsDra = new File("Dracula.txt");
		TreeSet<String> GatsbyList = loadWords(GreatGatsby); 
		TreeSet<String> DraList = loadWords(wordsDra); 
		System.out.println(GreatGatsby.exists());
		System.out.println(GatsbyList.size());
		System.out.println(wordsDra.exists());
		System.out.println(DraList.size());
		
		System.out.println();
		displayWords(GatsbyList);
//		displayWords(DraList);
	}

	private static void displayWords(TreeSet<String> list) {
		// TreeSet을 입력받아 저장된 모든 단어를 출력하는 메소드 
		int count =0;
		for(String word : list){
			if(word.length()>=6) {
			System.out.printf("%-16s\t",word);
			count++;
			if(count ==6) {
				System.out.println();
				count=0;
			}
			}
		}
	}

	private static TreeSet<String> loadWords(File file) throws IOException {
		// 파일을 입력하면 읽어서 단어들을 TreeSet으로 리턴
		TreeSet<String> wordSet = new TreeSet<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) 
			{
				String line = null;
				while((line = br.readLine()) != null) { //파일을 한줄씩 읽다가 마지막글을 읽고나면 종료
					String[] words = line.split("[^a-zA-Z]"); //영문 단어 배열로 리턴
					
					for(String w : words) {
						if(w.length()<2) {
							continue;
						}//단어가 철자 한개 이하는 제외
						wordSet.add(w.toLowerCase());//단어들을 소문자로 리스트 작성
					}
				}
		}
		return wordSet;
	}

}
