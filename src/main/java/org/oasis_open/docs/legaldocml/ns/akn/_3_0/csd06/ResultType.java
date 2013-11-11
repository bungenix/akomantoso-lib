//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.11 at 11:34:41 PM EAT 
//


package org.oasis_open.docs.legaldocml.ns.akn._3_0.csd06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="deny"/>
 *     &lt;enumeration value="dismiss"/>
 *     &lt;enumeration value="uphold"/>
 *     &lt;enumeration value="revert"/>
 *     &lt;enumeration value="replaceOrder"/>
 *     &lt;enumeration value="remit"/>
 *     &lt;enumeration value="decide"/>
 *     &lt;enumeration value="approve"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resultType")
@XmlEnum
public enum ResultType {

    @XmlEnumValue("deny")
    DENY("deny"),
    @XmlEnumValue("dismiss")
    DISMISS("dismiss"),
    @XmlEnumValue("uphold")
    UPHOLD("uphold"),
    @XmlEnumValue("revert")
    REVERT("revert"),
    @XmlEnumValue("replaceOrder")
    REPLACE_ORDER("replaceOrder"),
    @XmlEnumValue("remit")
    REMIT("remit"),
    @XmlEnumValue("decide")
    DECIDE("decide"),
    @XmlEnumValue("approve")
    APPROVE("approve");
    private final String value;

    ResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultType fromValue(String v) {
        for (ResultType c: ResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
