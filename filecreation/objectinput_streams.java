package filecreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.net.URI;

import javax.tools.FileObject;

class Student implements Serializable {
	String Std_name;
	int std_id;
	public Student(int std_id, String Std_name) {
		this.Std_name = Std_name;
		this.std_id = std_id;
	}
}
public class objectinput_streams {
	public static void main(String[] args) {
		Student s = new Student( 78, "dedee");
		try {
			ObjectOutputStream O = new ObjectOutputStream(new FileOutputStream("index.txt"));
			O.writeObject(s);
			System.out.println("data is inserted");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("index.txt"));
			Student s1 = (Student)oi.readObject();
			System.out.println(s1.std_id + ":" + s1.Std_name);
			oi.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
