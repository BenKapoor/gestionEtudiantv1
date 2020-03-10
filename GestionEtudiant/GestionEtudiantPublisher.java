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
	public static final String uri = "http://localhost:8888/hello";
           
	public static void main(String[] args) {
		IDirectionService service = new DirectionService();
		ICoursService coursService = new CoursService();
		// pour rendre disponible l'instance
		Endpoint endpoint = Endpoint.publish(uri, service);
		// pour tester la disponibilité du endpoint
		boolean status = endpoint.isPublished();
		System.out.println("Web Service disponible ? : " + status);
	}
}
