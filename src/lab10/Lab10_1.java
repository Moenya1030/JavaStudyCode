package lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("../MyFile.txt");
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte b[] = "Java≥Ã–Ú…Ëº∆".getBytes();
			out.write(b);
			out.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println(new String(byt, 0, len));
			in.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
