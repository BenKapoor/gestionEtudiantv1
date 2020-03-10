package eu.ensup.gestionetudiant.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import directionClient.DirectionServiceService;
import directionClient.Etudiant;
import directionClient.IDirectionService;
import eu.ensup.gestionetudiant.domaine.Direction;
import eu.ensup.gestionetudiant.service.DirectionService;
import eu.ensup.gestionetudiant.service.LoginService;

/**
 * Servlet implementation class AjouterEtudiant
 */
@WebServlet("/ajouter-etudiant")
public class AjouterEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterEtudiantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rs = request.getRequestDispatcher("ajouterEtudiant.jsp");
		rs.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				String mail = request.getParameter("mail");
				String adresse = request.getParameter("adresse");
				int telephone = Integer.parseInt(request.getParameter("telephone")); 
				String dateNaissance = request.getParameter("dateNaissance");

				DirectionServiceService impl = new DirectionServiceService();
				
				IDirectionService port = impl.getDirectionServicePort();
				
				Etudiant etu = new Etudiant();
				
				int a = port.creerEtudiant(etu);
				
				System.out.println("a: "+ a);
				
//				Etudiant etu = new Etudiant(nom, prenom, mail, adresse, telephone, dateNaissance);
//				DirectionService service = new DirectionService();
//				service.creerEtudiant(etu);				
				
				doGet(request, response);
	}

}
