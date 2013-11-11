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
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}modificationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}old" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}new" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}TextualMods" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "old",
    "_new"
})
@XmlRootElement(name = "textualMod")
public class TextualMod
    extends ModificationType
{

    protected List<AnyOtherType> old;
    @XmlElement(name = "new")
    protected List<AnyOtherType> _new;
    @XmlAttribute(name = "type", required = true)
    protected TextualMods type;

    /**
     * Gets the value of the old property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the old property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyOtherType }
     * 
     * 
     */
    public List<AnyOtherType> getOld() {
        if (old == null) {
            old = new ArrayList<AnyOtherType>();
        }
        return this.old;
    }

    /**
     * Gets the value of the new property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the new property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNew().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyOtherType }
     * 
     * 
     */
    public List<AnyOtherType> getNew() {
        if (_new == null) {
            _new = new ArrayList<AnyOtherType>();
        }
        return this._new;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TextualMods }
     *     
     */
    public TextualMods getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualMods }
     *     
     */
    public void setType(TextualMods value) {
        this.type = value;
    }

}
