//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.23 at 11:54:31 AM PDT 
//


package spdx.xsd._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for RelationshipType properties
 * 
 * <p>Java class for RelationshipTypeCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipTypeCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;spdx:xsd::1.0>RelationshipTypeCodeSimpleType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipTypeCodeType", propOrder = {
    "value"
})
public class RelationshipTypeCode {

    @XmlValue
    protected RelationshipTypeCodeSimpleType value;

    /**
     * A data type for RelationshipType properties
     * 
     * @return
     *     possible object is
     *     {@link RelationshipTypeCodeSimpleType }
     *     
     */
    public RelationshipTypeCodeSimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipTypeCodeSimpleType }
     *     
     */
    public void setValue(RelationshipTypeCodeSimpleType value) {
        this.value = value;
    }

}
