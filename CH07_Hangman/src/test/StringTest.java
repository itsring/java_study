package test;

public class StringTest {

	public static void main(String[] args) {
		
		String text = "I ";
		text += "have ";
		text += "a dog";
		
		System.out.println(text);
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("I ");
		sb1.append("have ");
		sb1.append("a ");
		sb1.append("dog");
		
		String result = sb1.toString();
		System.out.println(result);
		
		String animal = "cat";
		StringBuilder sb2 = new StringBuilder("I ");
		sb2.append("have ").append("a ").append(animal);
		
		System.out.println(sb2);

	}

}
