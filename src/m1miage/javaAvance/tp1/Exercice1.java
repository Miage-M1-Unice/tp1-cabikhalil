package m1miage.javaAvance.tp1;

import java.io.File;
import java.io.FilenameFilter;

public class Exercice1 {
	

	public void listeContenuRepo() {
		File folder = new File(".");

		String[] files = folder.list();

		for (String file : files){

			System.out.println(file);

		}
	}

	public void listeContenuRepos(){
		File folder = new File(".");

		File[] files = folder.listFiles();

		for (File file : files){

			System.out.println(file);

		}
	}
	
	public void filtreListeContenuRepos(FilenameFilter filter){
		File folder = new File(".");

		File[] files = folder.listFiles();

		files = folder.listFiles(filter);

		for (File file : files){

			System.out.println(file);

		}
	}
	
	

	public static void main(String[] args) {
		Exercice1 rc= new Exercice1();
		rc.listeContenuRepo();

		rc.listeContenuRepos();
//		FilenameFilter ff = new FilenameFilter(){
//
//			@Override
//			public boolean accept(File dir, String name) {
//				// TODO Auto-generated method stub
//				return false;
//			}};
		
		rc.filtreListeContenuRepos(".java");
	}
}
