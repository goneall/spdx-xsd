//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.23 at 11:54:31 AM PDT 
//


package spdx.xsd._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Relationship type
 * 
 * <p>Java class for RelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{spdx:xsd::1.0}RelationshipTypeCode"/>
 *         &lt;element ref="{spdx:xsd::1.0}Comment"/>
 *         &lt;element ref="{spdx:xsd::1.0}RelatedSpdxElement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipType", propOrder = {
    "relationshipTypeCode",
    "comment",
    "relatedSpdxElement"
})
public class Relationship {

    @XmlElement(name = "RelationshipTypeCode", required = true, nillable = true)
    protected RelationshipTypeCode relationshipTypeCode;
    @XmlElement(name = "Comment", required = true, nillable = true)
    protected Comment comment;
    @XmlElement(name = "RelatedSpdxElement", required = true, nillable = true)
    protected Relationship relatedSpdxElement;

    /**
     * Gets the value of the relationshipTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipTypeCode }
     *     
     */
    public RelationshipTypeCode getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    /**
     * Sets the value of the relationshipTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipTypeCode }
     *     
     */
    public void setRelationshipTypeCode(RelationshipTypeCode value) {
        this.relationshipTypeCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the relatedSpdxElement property.
     * 
     * @return
     *     possible object is
     *     {@link Relationship }
     *     
     */
    public Relationship getRelatedSpdxElement() {
        return relatedSpdxElement;
    }

    /**
     * Sets the value of the relatedSpdxElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationship }
     *     
     */
    public void setRelatedSpdxElement(Relationship value) {
        this.relatedSpdxElement = value;
    }

}
