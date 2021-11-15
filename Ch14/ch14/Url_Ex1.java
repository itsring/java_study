package ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Url_Ex1 {

	public static void main(String[] args) {
		try {
			String str = "https://search.naver.com:80/search.naver?" 
					+ "where=nexearch&sm=top_hty&fbm=1&ie=utf8&"
					+ "query=java#top";
			// 자바는 무조건 객체화 시켜야 함
			URL url = new URL(str);
			System.out.println("Protocol : " + url.getProtocol());	//https
			System.out.println("Host : " + url.getHost());	//search.naver.com
			System.out.println("Port : " + url.getPort());	//80
			System.out.println("Path : " + url.getPath());	//?뒤에꺼 where~utf8&
			System.out.println("Query : " + url.getQuery());	//where~query=java까지
			System.out.println("Filename : " + url.getFile());	//#뒤에꺼
			System.out.println("ref : " + url.getRef());
			url=new URL("http://jspstudy.co.kr");
			BufferedReader br= new BufferedReader(new InputStreamReader(
					url.openStream(),"UTF-8"));
			String line="";
			while(true) {
				line = br.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
				br.close();
				System.out.println("End~~~~~~~~~~~~~~~~~");
		} catch (Exception e) {
			//
			e.printStackTrace();
		}
	}
}
