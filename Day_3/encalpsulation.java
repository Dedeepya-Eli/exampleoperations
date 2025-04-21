package Day_3;

class Student{
	private String Rollnum;
	private String StdName;
	private String Stdemail;
	private String StdPassword;
	public String getRollnum() {
		return Rollnum;
	}
	public void setRollnum(String rollnum) {
		Rollnum = rollnum;
	}
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public String getStdemail() {
		return Stdemail;
	}
	public void setStdemail(String stdemail) {
		Stdemail = stdemail;
	}
	public String getStdPassword() {
		return StdPassword;
	}
	public void setStdPassword(String stdPassword) {
		StdPassword = stdPassword;
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String rollnum, String stdName, String stdemail, String stdPassword) {
		super();
		Rollnum = rollnum;
		StdName = stdName;
		Stdemail = stdemail;
		StdPassword = stdPassword;
	}
	
	
}
public class encalpsulation {
	public static void main(String[] args) {
		Student s= new Student();
		s.setRollnum("83");
		System.out.println(s.getRollnum());
		s.setStdName("dedee");
		System.out.println(s.getStdName());
		s.setStdemail("dedee@123");
		System.out.println(s.getStdemail());
		s.setStdPassword("d@123");;
		System.out.println(s.getStdPassword());
	}

}
