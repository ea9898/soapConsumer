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
import javax.xml.bind.annotation.XmlType;


/**
 * Проверка целостности и подписи в QR-кодах
 * 
 * <p>Java class for QrStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QrStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:fciit:svd}ValidationStep"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cms" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QrStep", propOrder = {
    "text",
    "cms"
})
public class QrStep
    extends ValidationStep
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String text;
    protected byte[] cms;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the cms property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCms() {
        return cms;
    }

    /**
     * Sets the value of the cms property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCms(byte[] value) {
        this.cms = value;
    }

}
