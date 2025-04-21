package filecreation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_creation {
	public static void main(String[] args) {
		String feedback = "issue resolved";
		try(
			FileWriter fw = new FileWriter("data.txt");
				){
			fw.write(feedback);
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		try(
				FileReader fr = new FileReader("data.txt");
				){
			StringBuilder sb = new StringBuilder();
			int characters;
			while((characters = fr.read())!= -1) {
				sb.append((char)characters);
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
