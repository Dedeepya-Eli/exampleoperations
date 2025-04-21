package inputandoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class prog_1 {
	public static void main(String[] args) {
		String sourcepath = "C:/Users/User/OneDrive/Pictures/Screenshots";
		String destinationpath = "C:/Users/User/OneDrive/Pictures/Screenshots/Screenshot 2025-04-05 120930.png";
		try(
				FileInputStream fis = new FileInputStream(sourcepath);
		        FileOutputStream fos = new FileOutputStream(destinationpath);
				) 
		{
			byte[] buffer = new byte[1024];
			int byteread;
			while((byteread = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteread);
			}
			System.out.println("successfully created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
