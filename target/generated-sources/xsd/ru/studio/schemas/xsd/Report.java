//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.07 at 06:40:39 PM MSK 
//


package ru.studio.schemas.xsd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Отчёт по документу
 * 
 * <p>Java class for Report complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Report"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flk" type="{urn:fciit:svd}FlkStep" minOccurs="0"/&gt;
 *         &lt;element name="notary" type="{urn:fciit:svd}NotaryStep" minOccurs="0"/&gt;
 *         &lt;element name="assistant" type="{urn:fciit:svd}AssistantStep" minOccurs="0"/&gt;
 *         &lt;element name="document" type="{urn:fciit:svd}DocumentStep" minOccurs="0"/&gt;
 *         &lt;element name="applicant" type="{urn:fciit:svd}ApplicantStep" minOccurs="0"/&gt;
 *         &lt;element name="blank" type="{urn:fciit:svd}BlankStep" minOccurs="0"/&gt;
 *         &lt;element name="qr" type="{urn:fciit:svd}QrStep" minOccurs="0"/&gt;
 *         &lt;element name="candocuments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{urn:fciit:svd}CanDocumentStep"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="candocument" type="{urn:fciit:svd}CanDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="resolution" type="{urn:fciit:svd}ResolutionStep" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report", propOrder = {
    "flk",
    "notary",
    "assistant",
    "document",
    "applicant",
    "blank",
    "qr",
    "candocuments",
    "resolution"
})
public class Report
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected FlkStep flk;
    protected NotaryStep notary;
    protected AssistantStep assistant;
    protected DocumentStep document;
    protected ApplicantStep applicant;
    protected BlankStep blank;
    protected QrStep qr;
    protected Report.Candocuments candocuments;
    protected ResolutionStep resolution;

    /**
     * Gets the value of the flk property.
     * 
     * @return
     *     possible object is
     *     {@link FlkStep }
     *     
     */
    public FlkStep getFlk() {
        return flk;
    }

    /**
     * Sets the value of the flk property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlkStep }
     *     
     */
    public void setFlk(FlkStep value) {
        this.flk = value;
    }

    /**
     * Gets the value of the notary property.
     * 
     * @return
     *     possible object is
     *     {@link NotaryStep }
     *     
     */
    public NotaryStep getNotary() {
        return notary;
    }

    /**
     * Sets the value of the notary property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaryStep }
     *     
     */
    public void setNotary(NotaryStep value) {
        this.notary = value;
    }

    /**
     * Gets the value of the assistant property.
     * 
     * @return
     *     possible object is
     *     {@link AssistantStep }
     *     
     */
    public AssistantStep getAssistant() {
        return assistant;
    }

    /**
     * Sets the value of the assistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistantStep }
     *     
     */
    public void setAssistant(AssistantStep value) {
        this.assistant = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStep }
     *     
     */
    public DocumentStep getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStep }
     *     
     */
    public void setDocument(DocumentStep value) {
        this.document = value;
    }

    /**
     * Gets the value of the applicant property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantStep }
     *     
     */
    public ApplicantStep getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantStep }
     *     
     */
    public void setApplicant(ApplicantStep value) {
        this.applicant = value;
    }

    /**
     * Gets the value of the blank property.
     * 
     * @return
     *     possible object is
     *     {@link BlankStep }
     *     
     */
    public BlankStep getBlank() {
        return blank;
    }

    /**
     * Sets the value of the blank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlankStep }
     *     
     */
    public void setBlank(BlankStep value) {
        this.blank = value;
    }

    /**
     * Gets the value of the qr property.
     * 
     * @return
     *     possible object is
     *     {@link QrStep }
     *     
     */
    public QrStep getQr() {
        return qr;
    }

    /**
     * Sets the value of the qr property.
     * 
     * @param value
     *     allowed object is
     *     {@link QrStep }
     *     
     */
    public void setQr(QrStep value) {
        this.qr = value;
    }

    /**
     * Gets the value of the candocuments property.
     * 
     * @return
     *     possible object is
     *     {@link Report.Candocuments }
     *     
     */
    public Report.Candocuments getCandocuments() {
        return candocuments;
    }

    /**
     * Sets the value of the candocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report.Candocuments }
     *     
     */
    public void setCandocuments(Report.Candocuments value) {
        this.candocuments = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionStep }
     *     
     */
    public ResolutionStep getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionStep }
     *     
     */
    public void setResolution(ResolutionStep value) {
        this.resolution = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{urn:fciit:svd}CanDocumentStep"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="candocument" type="{urn:fciit:svd}CanDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "candocument"
    })
    public static class Candocuments
        extends CanDocumentStep
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected List<CanDocumentType> candocument;

        /**
         * Gets the value of the candocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the candocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCandocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CanDocumentType }
         * 
         * 
         */
        public List<CanDocumentType> getCandocument() {
            if (candocument == null) {
                candocument = new ArrayList<CanDocumentType>();
            }
            return this.candocument;
        }

    }

}
