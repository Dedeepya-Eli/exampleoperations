package Day_12;

import java.util.ArrayList;

class Student{
	private String Rollnum;
	private String StdName;
	private String Stdemail;
	private String Stdpassword;
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
	public String getStdpassword() {
		return Stdpassword;
	}
	public void setStdpassword(String stdpassword) {
		Stdpassword = stdpassword;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String rollnum, String stdName, String stdemail, String stdpassword) {
		super();
		Rollnum = rollnum;
		StdName = stdName;
		Stdemail = stdemail;
		Stdpassword = stdpassword;
	}

	@Override
	public String toString() {
		return "Student [Rollnum=" + Rollnum + ", StdName=" + StdName + ", Stdemail=" + Stdemail + ", Stdpassword="
				+ Stdpassword + "]";
	}
	
	
}

public class exmple1 {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setRollnum("45");
		s1.setStdName("srav");
		s1.setStdemail("srav@123");
		s1.setStdpassword("1234");
		s.add(s1);
		System.out.println(s);

		
	}
}
