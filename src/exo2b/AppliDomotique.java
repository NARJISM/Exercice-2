package exo2b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AppliDomotique {
	
	static ArrayList<IConnectable> lesConnectes=new ArrayList<IConnectable>();
	
	public static String saisieNomClasse() {
		String nomClasse = new String();
		System.out.println("Taper Entr�e pour finir ou le nom de la classe de l'objet � connecter");
		BufferedReader in=new BufferedReader(new InputStreamReader( System.in ));
		try {
			nomClasse = in.readLine();
		}
		catch (IOException e) {}
		return nomClasse;
	}
	
	public static void connecter(String nomClasse) {
		// A compl�ter
	}
	
	public static void main(String[] args) {
		String classeEffective;
		while (!(classeEffective = saisieNomClasse()).isEmpty()){
			connecter(classeEffective);
		}
		System.out.println(lesConnectes);
	}

}
