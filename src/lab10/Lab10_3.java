package lab10;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;



public class Lab10_3 {
	private void zip(String zipFileName, File inputFile) throws Exception {
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName)); 
		zip(out, inputFile, inputFile.getName()); 
		System.out.println("压缩中…"); 
		out.close(); 
	}
	
	private void zip(ZipOutputStream out, File f, String base)throws Exception { 
		if (f.isDirectory()) { 
			File[] fl = f.listFiles(); 
			base+="/";
			out.putNextEntry(new ZipEntry(base)); 
//			base = base.length() == 0 ? "" : base + "/"; 
			for (int i = 0; i < fl.length; i++) { 
				zip(out, fl[i], base + fl[i].getName());
			}
		} else {
			out.putNextEntry(new ZipEntry(base)); 
			FileInputStream in = new FileInputStream(f);
			int b; 
			System.out.println(base);
			while ((b = in.read()) != -1) { 
				out.write(b); 
			}
			in.close(); 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs = new FileOutputStream("MyText.txt");
			DataOutputStream ds = new DataOutputStream(fs);
			ds.writeUTF("使用writeUFT()方法写入数据;"); 
			ds.close(); 
		}catch (Exception e) {
			e.printStackTrace(); 
		}
		
		Lab10_3 book = new Lab10_3();
		try {
			book.zip("MyText.zip", new File("src"));
			System.out.println("压缩完成");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		File file = new File("MyText.zip");
		ZipInputStream zin; 
		try { 
			ZipFile zipFile = new ZipFile(file);
			zin = new ZipInputStream(new FileInputStream("MyText.zip"));
			ZipEntry entry = zin.getNextEntry(); 
			while (((entry = zin.getNextEntry()) != null)){
				File tmp = new File("d:\\" + entry.getName()); 
				if (!tmp.exists()) { 
					OutputStream os = new FileOutputStream(tmp);
					InputStream in = zipFile.getInputStream(entry);
					int count = 0;
					while((count = in.read()) != -1) {
						os.write(count);
					}
					os.close();
					in.close();
				}
				zin.closeEntry();
				System.out.println(entry.getName() + "解压成功");
			}
			zin.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
