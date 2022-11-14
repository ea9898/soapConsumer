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
 * <p>Java class for ActCertifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActCertifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="NotaryCertifier" type="{urn:fciit:svd}NotaryCertifierType"/&gt;
 *         &lt;element name="LocalOfficialCertifier" type="{urn:fciit:svd}LPerson"/&gt;
 *         &lt;element name="ConsularOfficialCertifier" type="{urn:fciit:svd}CPerson"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActCertifierType", propOrder = {
    "notaryCertifier",
    "localOfficialCertifier",
    "consularOfficialCertifier"
})
public class ActCertifierType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NotaryCertifier")
    protected NotaryCertifierType notaryCertifier;
    @XmlElement(name = "LocalOfficialCertifier")
    protected LPerson localOfficialCertifier;
    @XmlElement(name = "ConsularOfficialCertifier")
    protected CPerson consularOfficialCertifier;

    /**
     * Gets the value of the notaryCertifier property.
     * 
     * @return
     *     possible object is
     *     {@link NotaryCertifierType }
     *     
     */
    public NotaryCertifierType getNotaryCertifier() {
        return notaryCertifier;
    }

    /**
     * Sets the value of the notaryCertifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaryCertifierType }
     *     
     */
    public void setNotaryCertifier(NotaryCertifierType value) {
        this.notaryCertifier = value;
    }

    /**
     * Gets the value of the localOfficialCertifier property.
     * 
     * @return
     *     possible object is
     *     {@link LPerson }
     *     
     */
    public LPerson getLocalOfficialCertifier() {
        return localOfficialCertifier;
    }

    /**
     * Sets the value of the localOfficialCertifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link LPerson }
     *     
     */
    public void setLocalOfficialCertifier(LPerson value) {
        this.localOfficialCertifier = value;
    }

    /**
     * Gets the value of the consularOfficialCertifier property.
     * 
     * @return
     *     possible object is
     *     {@link CPerson }
     *     
     */
    public CPerson getConsularOfficialCertifier() {
        return consularOfficialCertifier;
    }

    /**
     * Sets the value of the consularOfficialCertifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPerson }
     *     
     */
    public void setConsularOfficialCertifier(CPerson value) {
        this.consularOfficialCertifier = value;
    }

}
