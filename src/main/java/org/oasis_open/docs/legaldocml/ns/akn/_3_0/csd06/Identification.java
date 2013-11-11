//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.11 at 11:34:41 PM EAT 
//


package org.oasis_open.docs.legaldocml.ns.akn._3_0.csd06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}FRBRWork"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}FRBRExpression"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}FRBRManifestation"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}FRBRItem" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}source"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "frbrWork",
    "frbrExpression",
    "frbrManifestation",
    "frbrItem"
})
@XmlRootElement(name = "identification")
public class Identification {

    @XmlElement(name = "FRBRWork", required = true)
    protected FRBRWork frbrWork;
    @XmlElement(name = "FRBRExpression", required = true)
    protected FRBRExpression frbrExpression;
    @XmlElement(name = "FRBRManifestation", required = true)
    protected FRBRManifestation frbrManifestation;
    @XmlElement(name = "FRBRItem")
    protected CoreProperties frbrItem;
    @XmlAttribute(name = "source", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String source;

    /**
     * Gets the value of the frbrWork property.
     * 
     * @return
     *     possible object is
     *     {@link FRBRWork }
     *     
     */
    public FRBRWork getFRBRWork() {
        return frbrWork;
    }

    /**
     * Sets the value of the frbrWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRBRWork }
     *     
     */
    public void setFRBRWork(FRBRWork value) {
        this.frbrWork = value;
    }

    /**
     * Gets the value of the frbrExpression property.
     * 
     * @return
     *     possible object is
     *     {@link FRBRExpression }
     *     
     */
    public FRBRExpression getFRBRExpression() {
        return frbrExpression;
    }

    /**
     * Sets the value of the frbrExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRBRExpression }
     *     
     */
    public void setFRBRExpression(FRBRExpression value) {
        this.frbrExpression = value;
    }

    /**
     * Gets the value of the frbrManifestation property.
     * 
     * @return
     *     possible object is
     *     {@link FRBRManifestation }
     *     
     */
    public FRBRManifestation getFRBRManifestation() {
        return frbrManifestation;
    }

    /**
     * Sets the value of the frbrManifestation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRBRManifestation }
     *     
     */
    public void setFRBRManifestation(FRBRManifestation value) {
        this.frbrManifestation = value;
    }

    /**
     * Gets the value of the frbrItem property.
     * 
     * @return
     *     possible object is
     *     {@link CoreProperties }
     *     
     */
    public CoreProperties getFRBRItem() {
        return frbrItem;
    }

    /**
     * Sets the value of the frbrItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreProperties }
     *     
     */
    public void setFRBRItem(CoreProperties value) {
        this.frbrItem = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
