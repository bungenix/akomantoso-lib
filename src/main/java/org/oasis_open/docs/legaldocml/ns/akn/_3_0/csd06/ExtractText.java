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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}inline">
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}quote"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "extractText")
public class ExtractText
    extends ComplexTypeInline
{

    @XmlAttribute(name = "startQuote")
    protected String startQuote;
    @XmlAttribute(name = "endQuote")
    protected String endQuote;

    /**
     * Gets the value of the startQuote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartQuote() {
        return startQuote;
    }

    /**
     * Sets the value of the startQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartQuote(String value) {
        this.startQuote = value;
    }

    /**
     * Gets the value of the endQuote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndQuote() {
        return endQuote;
    }

    /**
     * Sets the value of the endQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndQuote(String value) {
        this.endQuote = value;
    }

}
