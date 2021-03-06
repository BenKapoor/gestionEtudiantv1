package eu.ensup.gestionetudiant.presentation;

import java.io.Console;
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

import eu.ensup.gestionetudiant.domaine.Etudiant;
//import directionClient.DirectionServiceService;
//import directionClient.Etudiant;
//import directionClient.IDirectionService;
import eu.ensup.gestionetudiant.service.DirectionService;

/**
 * Servlet implementation class ListeEtudiants
 */
@WebServlet("/liste-etudiants")
public class ListeEtudiantsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeEtudiantsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// DirectionServiceService impl = new DirectionServiceService();
		
//		IDirectionService port = impl.getDirectionServicePort();
//		System.out.println("ici");
//		List<Etudiant> listeEtudiants = port.listerEtudiants();
//		System.out.println("Hello "+listeEtudiants.size());
		
		DirectionService service = new DirectionService();
		List<Etudiant> listeEtudiants = new ArrayList<Etudiant>();
		listeEtudiants = service.listerEtudiants();
		
//		for(int i = 0; i < listeEtudiants.size(); i++) {
//			System.out.println("\t \n Nombre de joueurs : " + listeEtudiants.get(i).getNom());
//			
//		
//		}
		
		System.out.println(listeEtudiants);
		if (!(listeEtudiants.isEmpty())) {
			System.out.println(listeEtudiants);
			RequestDispatcher rs = request.getRequestDispatcher("listeEtudiants.jsp");
			HttpSession maSession = request.getSession();
			maSession.setAttribute("listeEtudiants", listeEtudiants);
			rs.forward(request, response);
		} else {
			
			RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
			rs.include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
