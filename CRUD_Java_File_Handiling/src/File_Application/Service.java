package File_Application;

import java.io.File;

public interface Service {

	public boolean CreateFile(String filename) ;
	public void Write(File filename , String data);
	public void ReadFile(File filename);
	public boolean deleteFle(File filename);
	
}
