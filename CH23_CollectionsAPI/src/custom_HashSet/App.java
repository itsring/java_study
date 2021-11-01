package custom_HashSet;

import java.util.HashSet;
import java.util.Objects;

class Creture {
	private int id;
	private String name;

	public Creture(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public String toString() {

		return id + " : " + name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) { // 객체의 id가 같으면 같게 리턴
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creture other = (Creture) obj;
		return id == other.id;
	}
	 
}

public class App {

	public static void main(String[] args) {
		// 커스텀 클래스 Creature 타입 셋 리스트 생성
		HashSet<Creture> creatures = new HashSet<>();
		// 셋형에서 중복의 비교는 객체의 equals 메소드를 사용해 같으면 제외
		creatures.add(new Creture(0,"고양이"));
		creatures.add(new Creture(1,"개"));
		creatures.add(new Creture(2,"돼지"));
		creatures.add(new Creture(2,"돼지"));
		creatures.add(new Creture(3,"호랑이"));
		creatures.add(new Creture(4,"사자"));
		creatures.add(new Creture(4,"말"));
		
		System.out.println(creatures.contains(new Creture(0, "고양이")));
		creatures.forEach(System.out::println);
		
	}

}
