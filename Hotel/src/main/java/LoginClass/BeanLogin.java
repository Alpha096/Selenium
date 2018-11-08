package LoginClass;

public class BeanLogin {
	private String uname;
	private String pass;
	private int age;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public BeanLogin(String uname, String pass, int age) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.age = age;
	}
	public BeanLogin() {
		super();
	}
		

}
