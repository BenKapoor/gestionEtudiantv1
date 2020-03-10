
package directionClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the directionClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ModifierEtudiantResponse_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "modifierEtudiantResponse");
    private final static QName _AjouterEtudiantCours_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "ajouterEtudiantCours");
    private final static QName _CreerEtudiantResponse_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "creerEtudiantResponse");
    private final static QName _ListerEtudiants_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "listerEtudiants");
    private final static QName _LireInfoEtudiantResponse_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "lireInfoEtudiantResponse");
    private final static QName _SupprimerEtudiantResponse_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "supprimerEtudiantResponse");
    private final static QName _ModifierEtudiant_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "modifierEtudiant");
    private final static QName _ListerEtudiantsResponse_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "listerEtudiantsResponse");
    private final static QName _SupprimerEtudiant_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "supprimerEtudiant");
    private final static QName _CreerEtudiant_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "creerEtudiant");
    private final static QName _LireInfoEtudiant_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "lireInfoEtudiant");
    private final static QName _AjouterEtudiantCoursResponse_QNAME = new QName("http://webservice.gestionetudiant.ensup.eu/", "ajouterEtudiantCoursResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: directionClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterEtudiantCours }
     * 
     */
    public AjouterEtudiantCours createAjouterEtudiantCours() {
        return new AjouterEtudiantCours();
    }

    /**
     * Create an instance of {@link ModifierEtudiantResponse }
     * 
     */
    public ModifierEtudiantResponse createModifierEtudiantResponse() {
        return new ModifierEtudiantResponse();
    }

    /**
     * Create an instance of {@link LireInfoEtudiantResponse }
     * 
     */
    public LireInfoEtudiantResponse createLireInfoEtudiantResponse() {
        return new LireInfoEtudiantResponse();
    }

    /**
     * Create an instance of {@link CreerEtudiantResponse }
     * 
     */
    public CreerEtudiantResponse createCreerEtudiantResponse() {
        return new CreerEtudiantResponse();
    }

    /**
     * Create an instance of {@link ListerEtudiants }
     * 
     */
    public ListerEtudiants createListerEtudiants() {
        return new ListerEtudiants();
    }

    /**
     * Create an instance of {@link SupprimerEtudiantResponse }
     * 
     */
    public SupprimerEtudiantResponse createSupprimerEtudiantResponse() {
        return new SupprimerEtudiantResponse();
    }

    /**
     * Create an instance of {@link ModifierEtudiant }
     * 
     */
    public ModifierEtudiant createModifierEtudiant() {
        return new ModifierEtudiant();
    }

    /**
     * Create an instance of {@link ListerEtudiantsResponse }
     * 
     */
    public ListerEtudiantsResponse createListerEtudiantsResponse() {
        return new ListerEtudiantsResponse();
    }

    /**
     * Create an instance of {@link SupprimerEtudiant }
     * 
     */
    public SupprimerEtudiant createSupprimerEtudiant() {
        return new SupprimerEtudiant();
    }

    /**
     * Create an instance of {@link CreerEtudiant }
     * 
     */
    public CreerEtudiant createCreerEtudiant() {
        return new CreerEtudiant();
    }

    /**
     * Create an instance of {@link LireInfoEtudiant }
     * 
     */
    public LireInfoEtudiant createLireInfoEtudiant() {
        return new LireInfoEtudiant();
    }

    /**
     * Create an instance of {@link AjouterEtudiantCoursResponse }
     * 
     */
    public AjouterEtudiantCoursResponse createAjouterEtudiantCoursResponse() {
        return new AjouterEtudiantCoursResponse();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

    /**
     * Create an instance of {@link Cours }
     * 
     */
    public Cours createCours() {
        return new Cours();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "modifierEtudiantResponse")
    public JAXBElement<ModifierEtudiantResponse> createModifierEtudiantResponse(ModifierEtudiantResponse value) {
        return new JAXBElement<ModifierEtudiantResponse>(_ModifierEtudiantResponse_QNAME, ModifierEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiantCours }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "ajouterEtudiantCours")
    public JAXBElement<AjouterEtudiantCours> createAjouterEtudiantCours(AjouterEtudiantCours value) {
        return new JAXBElement<AjouterEtudiantCours>(_AjouterEtudiantCours_QNAME, AjouterEtudiantCours.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "creerEtudiantResponse")
    public JAXBElement<CreerEtudiantResponse> createCreerEtudiantResponse(CreerEtudiantResponse value) {
        return new JAXBElement<CreerEtudiantResponse>(_CreerEtudiantResponse_QNAME, CreerEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "listerEtudiants")
    public JAXBElement<ListerEtudiants> createListerEtudiants(ListerEtudiants value) {
        return new JAXBElement<ListerEtudiants>(_ListerEtudiants_QNAME, ListerEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LireInfoEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "lireInfoEtudiantResponse")
    public JAXBElement<LireInfoEtudiantResponse> createLireInfoEtudiantResponse(LireInfoEtudiantResponse value) {
        return new JAXBElement<LireInfoEtudiantResponse>(_LireInfoEtudiantResponse_QNAME, LireInfoEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "supprimerEtudiantResponse")
    public JAXBElement<SupprimerEtudiantResponse> createSupprimerEtudiantResponse(SupprimerEtudiantResponse value) {
        return new JAXBElement<SupprimerEtudiantResponse>(_SupprimerEtudiantResponse_QNAME, SupprimerEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "modifierEtudiant")
    public JAXBElement<ModifierEtudiant> createModifierEtudiant(ModifierEtudiant value) {
        return new JAXBElement<ModifierEtudiant>(_ModifierEtudiant_QNAME, ModifierEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "listerEtudiantsResponse")
    public JAXBElement<ListerEtudiantsResponse> createListerEtudiantsResponse(ListerEtudiantsResponse value) {
        return new JAXBElement<ListerEtudiantsResponse>(_ListerEtudiantsResponse_QNAME, ListerEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "supprimerEtudiant")
    public JAXBElement<SupprimerEtudiant> createSupprimerEtudiant(SupprimerEtudiant value) {
        return new JAXBElement<SupprimerEtudiant>(_SupprimerEtudiant_QNAME, SupprimerEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "creerEtudiant")
    public JAXBElement<CreerEtudiant> createCreerEtudiant(CreerEtudiant value) {
        return new JAXBElement<CreerEtudiant>(_CreerEtudiant_QNAME, CreerEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LireInfoEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "lireInfoEtudiant")
    public JAXBElement<LireInfoEtudiant> createLireInfoEtudiant(LireInfoEtudiant value) {
        return new JAXBElement<LireInfoEtudiant>(_LireInfoEtudiant_QNAME, LireInfoEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiantCoursResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.gestionetudiant.ensup.eu/", name = "ajouterEtudiantCoursResponse")
    public JAXBElement<AjouterEtudiantCoursResponse> createAjouterEtudiantCoursResponse(AjouterEtudiantCoursResponse value) {
        return new JAXBElement<AjouterEtudiantCoursResponse>(_AjouterEtudiantCoursResponse_QNAME, AjouterEtudiantCoursResponse.class, null, value);
    }

}
