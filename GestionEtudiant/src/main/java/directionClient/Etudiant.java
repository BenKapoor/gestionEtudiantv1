
package directionClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour etudiant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="etudiant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.gestionetudiant.ensup.eu/}personne">
 *       &lt;sequence>
 *         &lt;element name="cours" type="{http://webservice.gestionetudiant.ensup.eu/}cours" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etudiant", propOrder = {
    "cours",
    "dateNaissance"
})
public class Etudiant
    extends Personne
{

    @XmlElement(nillable = true)
    protected List<Cours> cours;
    protected String dateNaissance;

    /**
     * Gets the value of the cours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cours }
     * 
     * 
     */
    public List<Cours> getCours() {
        if (cours == null) {
            cours = new ArrayList<Cours>();
        }
        return this.cours;
    }

    /**
     * Obtient la valeur de la propriété dateNaissance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Définit la valeur de la propriété dateNaissance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateNaissance(String value) {
        this.dateNaissance = value;
    }

}
