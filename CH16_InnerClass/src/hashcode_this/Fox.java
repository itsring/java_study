package hashcode_this;

public class Fox {
	public String name;
	
	public Fox() { //fox를 생성했을때 this가 그 주소
		System.out.println(this);
		this.name="폭스";
	}
}
