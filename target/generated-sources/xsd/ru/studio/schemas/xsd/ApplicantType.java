//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.07 at 06:40:39 PM MSK 
//


package ru.studio.schemas.xsd;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Обратившееся лицо в запросе
 * 
 * <p>Java class for ApplicantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PrivatePerson" type="{urn:fciit:svd}Person"/&gt;
 *         &lt;element name="RussianOrganization" type="{urn:fciit:svd}RussianOrganizationType"/&gt;
 *         &lt;element name="ForeginOrganization" type="{urn:fciit:svd}ForeginOrganizationType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicantType", propOrder = {
    "privatePerson",
    "russianOrganization",
    "foreginOrganization"
})
public class ApplicantType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PrivatePerson")
    protected Person privatePerson;
    @XmlElement(name = "RussianOrganization")
    protected RussianOrganizationType russianOrganization;
    @XmlElement(name = "ForeginOrganization")
    protected ForeginOrganizationType foreginOrganization;

    /**
     * Gets the value of the privatePerson property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPrivatePerson() {
        return privatePerson;
    }

    /**
     * Sets the value of the privatePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPrivatePerson(Person value) {
        this.privatePerson = value;
    }

    /**
     * Gets the value of the russianOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link RussianOrganizationType }
     *     
     */
    public RussianOrganizationType getRussianOrganization() {
        return russianOrganization;
    }

    /**
     * Sets the value of the russianOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RussianOrganizationType }
     *     
     */
    public void setRussianOrganization(RussianOrganizationType value) {
        this.russianOrganization = value;
    }

    /**
     * Gets the value of the foreginOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ForeginOrganizationType }
     *     
     */
    public ForeginOrganizationType getForeginOrganization() {
        return foreginOrganization;
    }

    /**
     * Sets the value of the foreginOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeginOrganizationType }
     *     
     */
    public void setForeginOrganization(ForeginOrganizationType value) {
        this.foreginOrganization = value;
    }

}