package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNot {
	public static void main(String[] args) throws IOException {
		File f= new File("D:\\file.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())>0) {
			System.out.print((char)temp);
		}
	}
}
