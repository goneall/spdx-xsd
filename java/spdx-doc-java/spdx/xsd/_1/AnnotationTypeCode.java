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
 * A data type for AnnotationType properties
 * 
 * <p>Java class for AnnotationTypeCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotationTypeCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;spdx:xsd::1.0>AnnotationTypeCodeSimpleType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationTypeCodeType", propOrder = {
    "value"
})
public class AnnotationTypeCode {

    @XmlValue
    protected AnnotationTypeCodeSimpleType value;

    /**
     * A data type for AnnotationType properties
     * 
     * @return
     *     possible object is
     *     {@link AnnotationTypeCodeSimpleType }
     *     
     */
    public AnnotationTypeCodeSimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationTypeCodeSimpleType }
     *     
     */
    public void setValue(AnnotationTypeCodeSimpleType value) {
        this.value = value;
    }

}
