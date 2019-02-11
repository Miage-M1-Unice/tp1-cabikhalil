package m1miage.javaAvance.tp1;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		System.out.println("WAoomia");
		if (name.endsWith(".java")) {
            return true;
        }
        return false;
    }

}
