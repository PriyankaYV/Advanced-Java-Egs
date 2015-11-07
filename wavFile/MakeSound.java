package wavFile;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class MakeSound {
		
	public static boolean playAudio(String file) throws IOException{
		Desktop d = Desktop.getDesktop();
		File f= new File(file);
		d.open(f);
		System.out.println("playing");
		return false;
	}

}
