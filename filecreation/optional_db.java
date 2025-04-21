package filecreation;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class User {
	private String Name;
	public User(String Name) {
		this.Name = Name;
		
	}
	public String User_Name() {
		return Name;
	}
}
public class optional_db {
	static Map<Integer, User> mp = new HashMap<Integer, User>();
	static {
		mp.put(1,new User("dedee"));
		mp.put(5, new User("teju"));
	}
	public static Optional<User> GetById(int id) {
		return Optional.ofNullable(mp.get(id));
		
	}
	public static void main(String[] args) {
		int searchid = 1;
		Optional<User> u1 = GetById(searchid);
		String message = u1.map(u -> "user found" + ":" + u.User_Name()).orElse("User not found");
		System.out.println(message);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("hh::mm::ss a");
		String str = lt.format(dt);
		System.out.println(str);
		
	}

}
