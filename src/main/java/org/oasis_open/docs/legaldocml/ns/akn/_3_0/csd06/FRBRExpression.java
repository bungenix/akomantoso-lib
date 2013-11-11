//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.11 at 11:34:41 PM EAT 
//


package org.oasis_open.docs.legaldocml.ns.akn._3_0.csd06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}coreProperties">
 *       &lt;sequence>
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}exprProperties"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "frbRauthoritative",
    "frbRlanguage",
    "frbRtranslation"
})
@XmlRootElement(name = "FRBRExpression")
public class FRBRExpression
    extends CoreProperties
{

    @XmlElement(name = "FRBRauthoritative")
    protected BooleanValueType frbRauthoritative;
    @XmlElement(name = "FRBRlanguage", required = true)
    protected List<FRBRlanguage> frbRlanguage;
    @XmlElement(name = "FRBRtranslation")
    protected List<FRBRtranslation> frbRtranslation;

    /**
     * Gets the value of the frbRauthoritative property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanValueType }
     *     
     */
    public BooleanValueType getFRBRauthoritative() {
        return frbRauthoritative;
    }

    /**
     * Sets the value of the frbRauthoritative property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanValueType }
     *     
     */
    public void setFRBRauthoritative(BooleanValueType value) {
        this.frbRauthoritative = value;
    }

    /**
     * Gets the value of the frbRlanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frbRlanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFRBRlanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FRBRlanguage }
     * 
     * 
     */
    public List<FRBRlanguage> getFRBRlanguage() {
        if (frbRlanguage == null) {
            frbRlanguage = new ArrayList<FRBRlanguage>();
        }
        return this.frbRlanguage;
    }

    /**
     * Gets the value of the frbRtranslation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frbRtranslation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFRBRtranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FRBRtranslation }
     * 
     * 
     */
    public List<FRBRtranslation> getFRBRtranslation() {
        if (frbRtranslation == null) {
            frbRtranslation = new ArrayList<FRBRtranslation>();
        }
        return this.frbRtranslation;
    }

}
