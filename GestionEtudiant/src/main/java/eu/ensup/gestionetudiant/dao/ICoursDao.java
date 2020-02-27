package eu.ensup.gestionetudiant.dao;

import java.util.List;

import eu.ensup.gestionetudiant.domaine.Cours;
import eu.ensup.gestionetudiant.domaine.Etudiant;

public interface ICoursDao {

	/**
	 * @return une liste des cours
	 */
	public List<Cours> listerCours();
	
	/**
	 * Cr�ation d'un cours
	 * @param cours
	 * @return un cours
	 */
	public int creerCours(Cours cours);
}
