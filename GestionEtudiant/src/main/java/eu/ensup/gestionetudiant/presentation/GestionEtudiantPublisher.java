package eu.ensup.gestionetudiant.presentation;

import eu.ensup.gestionetudiant.service.CoursService;
import eu.ensup.gestionetudiant.service.ICoursService;
import javax.xml.ws.Endpoint;
import eu.ensup.gestionetudiant.webservice.DirectionService;
import eu.ensup.gestionetudiant.webservice.IDirectionService;
import eu.ensup.gestionetudiant.webservice.IDirectionService;
//import eu.ensup.gestionetudiant.service.CoursService;
//import eu.ensup.gestionetudiant.service.ICoursService;

public class GestionEtudiantPublisher {
	public static final String uri = "http://localhost:8093/hello";
            public static final String uriCours = "http://localhost:8094/hello2";
	public static void main(String[] args) {
		IDirectionService service = new DirectionService();
		ICoursService coursService = new CoursService();
		// pour rendre disponible l'instance
//		Endpoint endpoint = Endpoint.publish(uri, service);
		Endpoint endpointCours = Endpoint.publish(uriCours, coursService);
		// pour tester la disponibilité du endpoint
	//	boolean status = endpoint.isPublished();
		boolean statusCours = endpointCours.isPublished();
	//	System.out.println("Web Service disponible ? : " + status);
		System.out.println("Web Service disponible ? : " + statusCours);
	}
}
