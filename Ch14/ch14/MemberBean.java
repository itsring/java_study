package ch14;

public class MemberBean {
	private String id;
	private String pwd;
	private String name;
	private String phone;
	private String team;
	
	
	/*
	 getter + setter
	 get 변수명, set변수명 : getId, setId
	 alt + shift + s -> getter and setter클릭 select all
	  */
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
}
