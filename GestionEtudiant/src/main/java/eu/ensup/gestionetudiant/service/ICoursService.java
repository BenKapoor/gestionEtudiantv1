package eu.ensup.gestionetudiant.service;

import java.util.List;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import eu.ensup.gestionetudiant.domaine.Cours;

@WebService
public interface ICoursService {

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
	
	/**
	 * Lit le d�tail des informations d'un cours
	 * @param idCours
	 * @return Cours
	 */
	public Cours lireInfoCours(int idCours);
}

