
package directionClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour cours complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cours">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etudiants" type="{http://webservice.gestionetudiant.ensup.eu/}etudiant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idCours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbHeure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cours", propOrder = {
    "etudiants",
    "idCours",
    "libelle",
    "nbHeure"
})
public class Cours {

    @XmlElement(nillable = true)
    protected List<Etudiant> etudiants;
    protected int idCours;
    protected String libelle;
    protected int nbHeure;

    /**
     * Gets the value of the etudiants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etudiants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtudiants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Etudiant }
     * 
     * 
     */
    public List<Etudiant> getEtudiants() {
        if (etudiants == null) {
            etudiants = new ArrayList<Etudiant>();
        }
        return this.etudiants;
    }

    /**
     * Obtient la valeur de la propri�t� idCours.
     * 
     */
    public int getIdCours() {
        return idCours;
    }

    /**
     * D�finit la valeur de la propri�t� idCours.
     * 
     */
    public void setIdCours(int value) {
        this.idCours = value;
    }

    /**
     * Obtient la valeur de la propri�t� libelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * D�finit la valeur de la propri�t� libelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbHeure.
     * 
     */
    public int getNbHeure() {
        return nbHeure;
    }

    /**
     * D�finit la valeur de la propri�t� nbHeure.
     * 
     */
    public void setNbHeure(int value) {
        this.nbHeure = value;
    }

}
