package eu.ensup.gestionetudiant.webservice;
import java.util.List;
import javax.jws.WebService;
import eu.ensup.gestionetudiant.domaine.Cours;
import eu.ensup.gestionetudiant.domaine.Etudiant;
/**
 * @author benja Interface du service de la gestion des �tudiants Elle comprends
 *         toutes les m�thodes obligatoire du service
 */
@WebService
public interface IDirectionService {
	/**
	 * Ajoute un �tudiaant � un cours
	 *
	 * @param etu
	 * @param c
	 * @return int
	 */
	public int ajouterEtudiantCours(Etudiant etu, Cours c);
	/**
	 * Cr�ation d'un �tudiant
	 *
	 * @param etu
	 * @return un �tudiant
	 */
	public int creerEtudiant(Etudiant etu);
	/**
	 * Lit le d�tail des informations d'un �tudiant
	 *
	 * @param idEtudiant
	 * @return Etudiant
	 */
	public Etudiant lireInfoEtudiant(int idEtudiant);
	/**
	 * @return une liste d'�tudiant
	 */
	public List<Etudiant> listerEtudiants();
	/**
	 * Modifier un �tudiant
	 *
	 * @param etu
	 * @return int
	 */
	public int modifierEtudiant(Etudiant etu);
	/**
	 * Supprime un �tudiant
	 *
	 * @param idEtudiant
	 * @return int
	 */
	public int supprimerEtudiant(int idEtudiant);
}