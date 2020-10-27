package File_Application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServiceImpl implements Service {
	Scanner sc = new Scanner(System.in);

	@Override
	public boolean CreateFile(String filename) {
		boolean result = false ;
		File file = new File(filename);
		try {
			if(file.createNewFile()) {
				result = true ;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result ;
	}

	@Override
	public void Write(File filename , String data) {
		try {
			FileWriter Writer = new FileWriter(filename);
			Writer.write(data);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void ReadFile(File filename) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deleteFle(File filename) {
		// TODO Auto-generated method stub
		return false;
	}

}
