//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.31 at 07:20:26 PM MSK 
//


package ru.studio.schemas.wsdl;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (ru.studio.utils.DatatypeConverter.parseDate(value));
    }

    public String marshal(Date value) {
        return (ru.studio.utils.DatatypeConverter.dateToString(value));
    }

}
