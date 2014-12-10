package pattern.exo3.visiteur;

import java.util.List;

import pattern.exo3.composite.ComposantSysteme;
import pattern.exo3.composite.Fichier;
import pattern.exo3.composite.Repertoire;

public class HierarchiqueVisiteur implements Visiteur {
	
	int profondeur = 0;
	
	public HierarchiqueVisiteur() {
	}

	@Override
	public void visit(Fichier fichier) {
		System.out.println(fichier.getNom() + "   " + fichier.getTaille());
		afterVisit(fichier);
	}

	@Override
	public void visit(Repertoire repertoire) {
		System.out.println(repertoire.getNom() + "   " + repertoire.getTaille());
	}

	@Override
	public void beforeVisit(ComposantSysteme composantSysteme) {
		for(int i = 0; i < profondeur; i++){
			System.out.print("\t");
		}
		System.out.print("\\------ ");
		profondeur++;
	}

	@Override
	public void afterVisit(ComposantSysteme composantSysteme) {
		profondeur--;
	}

}
